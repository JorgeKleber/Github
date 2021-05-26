package com.dev.kleber.github.search.presentation

import com.dev.kleber.github.search.SearchContract
import com.dev.kleber.github.search.usecase.SearchRepoUseCase

class SearchPresenter(private val view : SearchContract.View, val useCase: SearchRepoUseCase) : SearchContract.Presenter {

    override fun load() {
        view.showResults()
        useCase.searchRepo("language:kotlin","stars")
    }
}