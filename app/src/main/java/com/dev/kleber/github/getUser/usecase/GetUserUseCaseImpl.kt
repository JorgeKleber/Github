package com.dev.kleber.github.getUser.usecase

import com.dev.kleber.github.getUser.callback.GetUserCallback
import com.dev.kleber.github.getUser.data.User
import com.dev.kleber.github.getUser.repository.getUser.SearchUserRepository

class GetUserUseCaseImpl(
    private var searchUserRepo : SearchUserRepository
    ) : GetUserUseCase {

    override fun searchUser(userName: String, callback: GetUserCallback) {
        searchUserRepo.searchUser(userName, callback)
    }
}