package com.dev.kleber.github.search.presentation

import com.dev.kleber.github.search.SearchContract
import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.usecase.SearchRepoUseCase

class SearchPresenter(
    private val view : SearchContract.View,
    private val useCase: SearchRepoUseCase
    )
    : SearchContract.Presenter, SearchRepoCallback {

    override fun search(query: String) {
        view.showLoading()
        view.hideNetworkError()
        view.hideEmptyState()
        view.hideResults()
        useCase.searchRepo("language:$query","stars", this )
    }

    override fun loadingMore() {
        TODO()
    }

    override fun success(result: List<Repo>) {
        view.showResults()
        view.hideLoading()
    }

    override fun error() {
        view.hideLoading()
        view.showEmptyState()
    }
}