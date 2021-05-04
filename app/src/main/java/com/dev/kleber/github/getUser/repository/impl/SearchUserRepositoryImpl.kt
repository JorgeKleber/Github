package com.dev.kleber.github.getUser.repository.impl.remoteImpl

import com.dev.kleber.github.getUser.repository.SearchUserRepository

class SearchUserRepositoryImpl(
    val remote : SearchUserRepository
    ) : SearchUserRepository {

    override fun searchUser(userName: String) {
        remote.searchUser(userName)
    }
}