package com.dev.kleber.github.getUser.network

import com.dev.kleber.github.BuildConfig
import com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl.SearchUserRemoteImpl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GetUserApiFactory {

    fun createSearchUserApi() : SearchUserAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service = retrofit.create(SearchUserAPI::class.java)
        return service
    }

}