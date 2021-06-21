package com.dev.kleber.github.pullRequest.usecase

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.data.Pull
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository

class PullRequestUseCaseImpl (
    //private pq não enxerga do use case pra cima
    private var pullRepository : PullRepository
        ) : PullRequestUseCase {

    override fun getPullRequest(onwer : String, repo : String, callBack: PullRequestCallBack) {
        pullRepository.getPull(onwer,repo,callBack)
    }
}