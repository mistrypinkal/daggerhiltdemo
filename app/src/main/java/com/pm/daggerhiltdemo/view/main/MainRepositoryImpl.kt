package com.pm.daggerhiltdemo.view.main

import com.pm.daggerhiltdemo.data.api.CurrencyAPI
import com.pm.daggerhiltdemo.data.models.CurrencyResponse
import com.pm.daggerhiltdemo.util.Resource
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: CurrencyAPI
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if(response.isSuccessful && result!=null){
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }
        }catch (e: Exception){
            Resource.Error(e.message ?: "An Error occured")
        }
    }
}