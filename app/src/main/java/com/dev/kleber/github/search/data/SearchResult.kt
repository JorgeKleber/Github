package com.dev.kleber.github.search.data

import com.google.gson.annotations.SerializedName

data class SearchResult(

    @SerializedName("items")
    val list : List<Repo>

)