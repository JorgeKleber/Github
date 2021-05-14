package com.dev.kleber.github.getUser.usecase

import com.dev.kleber.github.getUser.callback.GetUserCallback

interface SearchUserUseCase {

    fun searchUser(userName : String)
}