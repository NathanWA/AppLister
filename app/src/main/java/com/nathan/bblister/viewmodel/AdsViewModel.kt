package com.nathan.bblister.viewmodel

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide
import com.nathan.bblister.api.Ad
import com.nathan.bblister.api.Ads
import com.nathan.bblister.repository.ListingRepository
import kotlinx.coroutines.launch

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) = Glide.with(view.context).load(url).into(view)

class AdsViewModel: ViewModel() {

    val searchInProcess= MutableLiveData<Boolean>(false)
    val searchComplete=MutableLiveData<Boolean>(false)


    //this is a list of products as retrieved by the repository.
    val productList = MutableLiveData<Ads>()
    val selectedProduct = MutableLiveData<Ad>()


    //retrieve searchItems
    fun retrieveListings()
    {
        searchInProcess.postValue(true)
        viewModelScope.launch {
            val list=ListingRepository.getAds()
            if(list!=null) {
                productList.postValue(list)
                searchComplete.postValue(true)
            }
            searchInProcess.postValue(false)
        }

    }

    //selects the product at the following index
    fun selectProduct(productIndex: Int)
    {
        selectedProduct.postValue(productList.value?.ad?.get(productIndex))
    }
}