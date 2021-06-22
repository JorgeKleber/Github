package com.dev.kleber.github.getUser.repository

import com.dev.kleber.github.getUser.network.SearchUserAPI
import com.dev.kleber.github.getUser.repository.getUser.SearchUserRepository
import com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl.SearchUserRemoteImpl
import com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl.SearchUserRepositoryImpl

object GetUserRepoFactory {

    fun createSearchUserRepo(userRepoObj : SearchUserAPI) : SearchUserRepository {

        var remote = SearchUserRemoteImpl(userRepoObj)
        var repository = SearchUserRepositoryImpl(remote)
        return repository

    }
}