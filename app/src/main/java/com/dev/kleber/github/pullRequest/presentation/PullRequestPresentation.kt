package com.dev.kleber.github.pullRequest.presentation

import com.dev.kleber.github.pullRequest.PullRequestContract
import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.data.Pull
import com.dev.kleber.github.pullRequest.usecase.PullRequestUseCase

class PullRequestPresentation(
    private val view : PullRequestContract.view,
    private val useCase : PullRequestUseCase
    )
    : PullRequestContract.Presenter, PullRequestCallBack{

    override fun searchPullRequest(owner : String, repo : String) {
        useCase.getPullRequest(owner,repo,this)
    }

    override fun loadingMore() {

    }

    override fun sucess(result: List<Pull>) {

    }

    override fun error() {

    }
}