package com.dev.kleber.github.pullRequest.repository

import com.dev.kleber.github.pullRequest.network.PullRepositoryAPI
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository
import com.dev.kleber.github.pullRequest.repository.pullRequest.impl.PullRepositoryImpl

object PullRequestFactory {

    fun createPullRequest(pull : PullRepositoryAPI) : PullRepository {

        var impl = PullRepositoryImpl(pull)

    }
}