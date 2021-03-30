package com.dev.kleber.github.search.network

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class SearchRepositoryInfrastructure : Callback<Any> {

    fun invoke() {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service : SearchRepositoryService = retrofit.create(SearchRepositoryService::class.java)
        service.searchRepositories().enqueue(this)

    }

    override fun onResponse(call: Call<Any>, response: Response<Any>) {
        Log.d("TESTE","VICTOR")
    }

    override fun onFailure(call: Call<Any>, t: Throwable) {
        Log.d("TESTE","VICTOR")
    }

}