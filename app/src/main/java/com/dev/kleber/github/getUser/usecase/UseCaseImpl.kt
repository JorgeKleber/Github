package com.dev.kleber.github.getUser.usecase

import com.dev.kleber.github.getUser.callback.GetUserCallback
import com.dev.kleber.github.getUser.data.User
import com.dev.kleber.github.getUser.repository.getUser.SearchUserRepository

class UseCaseImpl(
    private var searchUserRepo : SearchUserRepository
    ) : SearchUserUseCase, GetUserCallback {

    override fun searchUser(userName: String) {
        searchUserRepo.searchUser(userName, this)
    }

    override fun sucess(result: User) {

    }

    override fun error() {

    }
}