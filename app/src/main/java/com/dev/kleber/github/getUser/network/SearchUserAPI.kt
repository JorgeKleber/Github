package com.dev.kleber.github.getUser.network

import com.dev.kleber.github.getUser.data.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SearchUserAPI {

    @GET("/users/{username}")
    fun searchUser(@Path("username") userName : String) : Call<User>
}