package com.dev.kleber.github.search.network

import com.dev.kleber.github.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiFactory {

    fun createSearchRepositoryAPI() : SearchRepositoryAPI {

        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(SearchRepositoryAPI::class.java)
        return service
    }
}