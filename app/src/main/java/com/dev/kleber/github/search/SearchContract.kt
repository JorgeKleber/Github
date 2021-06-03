package com.dev.kleber.github.search

interface SearchContract {

    interface View {
        fun showResults()
        fun hideResults()
        fun showLoading()
        fun hideLoading()
        fun showNetworkError()
        fun hideNetworkError()
        fun showEmptyState() //kinjonum
        fun hideEmptyState()
    }

    interface Presenter {
        fun search(query : String)
        fun loadingMore()
    }
}