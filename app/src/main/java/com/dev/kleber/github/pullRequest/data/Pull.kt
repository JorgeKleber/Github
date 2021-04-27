package com.dev.kleber.github.pullRequest.data

import com.google.gson.annotations.SerializedName

class Pull(

    @SerializedName("id")
    val id : Int,
    @SerializedName("title")
    val title : String,
    @SerializedName("body")
    val body : String

 )