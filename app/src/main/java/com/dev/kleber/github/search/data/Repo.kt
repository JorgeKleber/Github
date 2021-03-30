package com.dev.kleber.github.search.data

import com.google.gson.annotations.SerializedName

class Repo(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String?,

    @SerializedName("forks_count")
    val forksCount: Int,

    @SerializedName("stargazers_count")
    val starsCount: Int,
)