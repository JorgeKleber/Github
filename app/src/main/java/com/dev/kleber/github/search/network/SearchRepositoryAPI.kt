package com.dev.kleber.github.search.network

import com.dev.kleber.github.search.data.SearchResult
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SearchRepositoryAPI {

    @GET("search/repositories")
    fun searchRepositories(@Query("q") query : String,
                           @Query("sort") sort : String,
                           @Query("page") page : Int) : Call<SearchResult>
}