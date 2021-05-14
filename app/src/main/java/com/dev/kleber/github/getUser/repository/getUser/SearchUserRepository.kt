package com.dev.kleber.github.getUser.repository.getUser

import com.dev.kleber.github.getUser.callback.GetUserCallback

interface SearchUserRepository {

    fun searchUser(userName : String, callback : GetUserCallback)

}