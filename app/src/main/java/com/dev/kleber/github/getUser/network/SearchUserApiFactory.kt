package com.dev.kleber.github.getUser.network

import com.dev.kleber.github.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SearchUserApiFactory {

    fun createSearchUserApi() : SearchUserAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service = retrofit.create(SearchUserAPI::class.java)
        return service
    }

}