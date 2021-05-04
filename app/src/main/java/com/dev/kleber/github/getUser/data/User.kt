package com.dev.kleber.github.getUser.data

import com.google.gson.annotations.SerializedName

class User(

    @SerializedName("id")
    val id : Int,
    @SerializedName("login")
    val login : String,
    @SerializedName("name")
    val name: String
)