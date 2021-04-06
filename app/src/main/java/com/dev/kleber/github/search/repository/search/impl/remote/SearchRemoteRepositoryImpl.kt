package com.dev.kleber.github.search.repository.search.impl.remote

import android.util.Log
import com.dev.kleber.github.BuildConfig
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.network.SearchRepositoryInfrastructure
import com.dev.kleber.github.search.repository.search.SearchRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SearchRemoteRepositoryImpl : SearchRepository {

    override fun searchRepo() {

        SearchRepositoryInfrastructure().invoke()

    }
}