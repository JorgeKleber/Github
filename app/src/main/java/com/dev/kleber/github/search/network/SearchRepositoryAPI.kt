package com.dev.kleber.github.search.network

import com.dev.kleber.github.search.data.SearchResult
import retrofit2.Call
import retrofit2.http.GET

interface SearchRepositoryAPI {

    @GET("search/repositories?q=language:Kotlin&sort=stars&page=1")
    fun searchRepositories() : Call<SearchResult>
}