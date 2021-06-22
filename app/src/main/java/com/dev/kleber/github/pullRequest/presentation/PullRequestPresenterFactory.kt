package com.dev.kleber.github.pullRequest.presentation

import com.dev.kleber.github.pullRequest.PullRequestContract
import com.dev.kleber.github.pullRequest.network.PullRequestAPIFactory
import com.dev.kleber.github.pullRequest.repository.PullRequestRepoFactory
import com.dev.kleber.github.pullRequest.usecase.PullRequestUseCaseImpl

object PullRequestPresenterFactory {

    fun CreatePullRequestPresenter(view : PullRequestContract.view) : PullRequestPresentation {

        val api = PullRequestAPIFactory.createPullRequestAPI()
        val repository = PullRequestRepoFactory.createPullRequestRepo(api)
        val usecase = PullRequestUseCaseImpl(repository)

        return PullRequestPresentation(view ,usecase)
    }
}