package com.dev.kleber.github.getUser.callback

import com.dev.kleber.github.getUser.data.User

interface GetUserCallback {

    fun sucess(result : User)
    fun error()

}