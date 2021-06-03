package com.dev.kleber.github.search.presentation

import com.dev.kleber.github.search.SearchContract
import com.dev.kleber.github.search.network.ApiFactory
import com.dev.kleber.github.search.repository.SearchRepositoryFactory
import com.dev.kleber.github.search.usecase.SearchRepoUseCase
import com.dev.kleber.github.search.usecase.UsecaseFactory

object PresenterFactory {

    fun createSearchPresenter( view: SearchContract.View) : SearchContract.Presenter {

        val api = ApiFactory.createSearchRepositoryAPI()
        val searchRepo = SearchRepositoryFactory.createSearchRepository(api)
        val useCase = UsecaseFactory.createSearchUseCase(searchRepo)
        return SearchPresenter(view, useCase)
    }
}