package com.pm.daggerhiltdemo.view.main

import com.pm.daggerhiltdemo.data.models.CurrencyResponse
import com.pm.daggerhiltdemo.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}