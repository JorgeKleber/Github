package com.dev.kleber.github.search.repository.search.impl.remote

import android.util.Log
import com.dev.kleber.github.BuildConfig
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.repository.search.SearchRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SearchRemoteRepositoryImpl : SearchRepository, Callback<SearchResult> {

    override fun searchRepo() {

        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service : SearchRepositoryAPI = retrofit.create(SearchRepositoryAPI::class.java)
        service.searchRepositories().enqueue(this)

    }

    override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>) {

        Log.d("TESTE","VICTOR")

    }

    override fun onFailure(call: Call<SearchResult>, t: Throwable) {

        Log.d("TESTE","VICTOR")
    }


}