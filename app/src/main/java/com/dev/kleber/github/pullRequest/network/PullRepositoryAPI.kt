package com.dev.kleber.github.pullRequest.network

import com.dev.kleber.github.pullRequest.data.Pull
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRepositoryAPI {
    @GET("/repos/{owner}/{repo}/pulls")
    fun searchPullRequest(@Path("owner") ownerName : String,
                          @Path("repo") repositoryName : String) : Call<List<Pull>>

}