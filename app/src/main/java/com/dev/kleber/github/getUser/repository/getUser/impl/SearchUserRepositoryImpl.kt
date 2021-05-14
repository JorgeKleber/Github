package com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl

import com.dev.kleber.github.getUser.callback.GetUserCallback
import com.dev.kleber.github.getUser.repository.getUser.SearchUserRepository

class SearchUserRepositoryImpl(
    val remote : SearchUserRepository
    ) : SearchUserRepository {

    override fun searchUser(userName: String, callback: GetUserCallback) {
        remote.searchUser(userName, callback)
    }
}