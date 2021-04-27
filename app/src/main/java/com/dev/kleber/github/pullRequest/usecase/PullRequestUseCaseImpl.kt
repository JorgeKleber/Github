package com.dev.kleber.github.pullRequest.usecase

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository

class PullRequestUseCaseImpl (
    var pullRepository: PullRepository
        ) : PullRequestUseCase, PullRequestCallBack {

    override fun getPullRequest(onwer : String, user : String) {
        pullRepository.getPull(onwer,user, this)
    }

    override fun sucesso(result: String) {

    }

    override fun error() {

    }

}