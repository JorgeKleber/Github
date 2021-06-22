package com.dev.kleber.github.getUser.presentation

import com.dev.kleber.github.getUser.GetUserContract
import com.dev.kleber.github.getUser.callback.GetUserCallback
import com.dev.kleber.github.getUser.data.User
import com.dev.kleber.github.getUser.usecase.GetUserUseCase

class GetUserPresentation(
    private val view : GetUserContract.View,
    private val usecase : GetUserUseCase
    )
    : GetUserContract.Presenter, GetUserCallback{

    override fun getUser(userName: String) {

        usecase.searchUser(userName, this)
    }

    override fun sucess(result: User) {
        TODO("Not yet implemented")
    }

    override fun error() {
        TODO("Not yet implemented")
    }
}