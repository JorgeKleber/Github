package com.dev.kleber.github.pullRequest.repository.pullRequest

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack

interface PullRepository {

    fun getPull(owner : String, repositoryName: String, callback : PullRequestCallBack)

}