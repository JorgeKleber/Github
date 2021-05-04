package com.dev.kleber.github.pullRequest.network

import com.dev.kleber.github.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object PullRequestAPIFactory {

    fun createPullRequestAPI() : PullRepositoryAPI{

        var retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(PullRepositoryAPI::class.java)
        return service
    }

}