package com.dev.kleber.github.search.network

import android.util.Log
import com.dev.kleber.github.BuildConfig
import com.dev.kleber.github.search.data.SearchResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.FormUrlEncoded


class SearchRepositoryInfrastructure : Callback<SearchResult> {

    fun invoke() {

        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service : SearchRepositoryAPI = retrofit.create(SearchRepositoryAPI::class.java)
        service.searchRepositories("laguage:Kotlin", "stars",1).enqueue(this)

    }

    override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>) {

        Log.d("TESTE","VICTOR")

    }

    override fun onFailure(call: Call<SearchResult>, t: Throwable) {

        Log.d("TESTE","VICTOR")
    }

}