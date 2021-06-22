package com.dev.kleber.github.getUser.usecase

import com.dev.kleber.github.getUser.callback.GetUserCallback

interface GetUserUseCase {

    fun searchUser(userName : String, callback: GetUserCallback)
}