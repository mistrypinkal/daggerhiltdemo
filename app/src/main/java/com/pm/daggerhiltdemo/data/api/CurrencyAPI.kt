package com.pm.daggerhiltdemo.data.api

import com.pm.daggerhiltdemo.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyAPI {

    @Headers("apikey: lE13DOd52itywFUreKLNwqVFkrrEVQAf")
    @GET("latest")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}