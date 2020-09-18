package com.nathan.bblister

import com.nathan.bblister.repository.ListingRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

/**
 * Local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RepositoryUnitTest {
    @Test
    fun getListingTest() {

        runBlocking {
            val productList =ListingRepository.getAds()
            Assert.assertNotNull(productList)
        }
    }
}