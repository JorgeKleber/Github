package com.dev.kleber.github.pullRequest.repository.pullRequest.impl

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository

class PullRepositoryImpl (
    private val remotePull : PullRepository
        ) : PullRepository {

    override fun getPull(owner: String,
                         repositoryName: String,
                         callback : PullRequestCallBack) {

        remotePull.getPull(owner, repositoryName, callback)
    }
}