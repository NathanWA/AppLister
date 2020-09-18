package com.nathan.bblister.repository
import com.nathan.bblister.api.Ads
import com.nathan.bblister.api.IAdRetriever
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import kotlin.text.StringBuilder as StringBuilder

//An object is equivalent to a singleton
object ListingRepository {

    val BaseUrl = "https://ads.appia.com/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BaseUrl)
        .addConverterFactory(    SimpleXmlConverterFactory.createNonStrict(
             Persister(
                 AnnotationStrategy() // important part!
                    ))
        )
        .build()

    val service = retrofit.create(IAdRetriever::class.java)

    //this is a suspend function that will require a scoped launch
    //it takes a search string as input
    suspend fun getAds(): Ads?
    {

        //use IO context for the network call
        return withContext(Dispatchers.IO)
        {
            val call = service.getAds()
            val response = call.execute()
            if (response.isSuccessful)
                return@withContext response.body()
            else
            //for now, return null for error. More error handling may be needed
                return@withContext null
        }

    }
}