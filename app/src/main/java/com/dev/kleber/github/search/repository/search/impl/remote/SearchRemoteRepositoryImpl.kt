package com.dev.kleber.github.search.repository.search.impl.remote

import android.util.Log
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.repository.search.SearchRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchRemoteRepositoryImpl(
    private val service : SearchRepositoryAPI
    )
    : SearchRepository, Callback<SearchResult> {

    override fun searchRepo() {

        service.searchRepositories().enqueue(this)
    }

    override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>) {

        Log.d("TESTE","VICTOR")

    }

    override fun onFailure(call: Call<SearchResult>, t: Throwable) {

        Log.d("TESTE","VICTOR")
    }


}