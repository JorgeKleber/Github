package com.dev.kleber.github.pullRequest.repository

import com.dev.kleber.github.pullRequest.network.PullRepositoryAPI
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository
import com.dev.kleber.github.pullRequest.repository.pullRequest.impl.PullRepositoryImpl
import com.dev.kleber.github.pullRequest.repository.pullRequest.impl.remoto.RemotePullImpl

object PullRequestRepoFactory {

    fun createPullRequestRepo(pullApi : PullRepositoryAPI) : PullRepository {

        val remote = RemotePullImpl(pullApi)
        val impl = PullRepositoryImpl(remote)
        return impl
    }
}