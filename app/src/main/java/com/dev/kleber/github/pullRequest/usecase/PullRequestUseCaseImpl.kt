package com.dev.kleber.github.pullRequest.usecase

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.data.Pull
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository

class PullRequestUseCaseImpl (
    //private pq não enxerga do use case pra cima
    private var pullRepository : PullRepository
        ) : PullRequestUseCase, PullRequestCallBack {

    override fun getPullRequest(onwer : String, repo : String) {
        pullRepository.getPull(onwer,repo, this)
    }
    override fun sucess(result: List<Pull>) {

    }
    override fun error() {

    }
}