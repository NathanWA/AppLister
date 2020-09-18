package com.nathan.bblister.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//retrofit interface to the
interface IAdRetriever {

    @GET("getAds?id=236&password=OVUJ1DJN&siteId=10777&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10&lname=mellor")
    fun getAds(): Call<Ads>
}