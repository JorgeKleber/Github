package com.dev.kleber.github.pullRequest

interface PullRequestContract {

    interface view{
        fun showResults()
        fun showLoading()
        fun showErrorMessage()
        fun showNetworkError()
    }

    interface Presenter{
        fun searchPullRequest(owner : String, repo : String)
        fun loadingMore()
    }
}