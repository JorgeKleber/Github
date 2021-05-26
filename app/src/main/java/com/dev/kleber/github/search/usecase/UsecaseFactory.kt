package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.repository.search.SearchRepository

object UsecaseFactory {

    fun createSearchUseCase(search : SearchRepository) : SearchRepoUseCase {
        return SearchRepoUseCase.Impl(search)
    }
}