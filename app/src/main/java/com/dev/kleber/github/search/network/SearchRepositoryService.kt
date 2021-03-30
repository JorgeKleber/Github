package com.dev.kleber.github.search.network

import retrofit2.Call
import retrofit2.http.GET

interface SearchRepositoryService {

    @GET("search/repositories?q=language:Kotlin&sort=stars&page=1")
    fun searchRepositories() : Call<Any>
}