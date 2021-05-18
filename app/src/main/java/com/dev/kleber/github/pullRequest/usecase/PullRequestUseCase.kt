package com.dev.kleber.github.pullRequest.usecase

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack

interface PullRequestUseCase {

    fun getPullRequest(onwer : String, user : String)
}