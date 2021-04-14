package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.repository.search.SearchRepository

interface SearchRepoUseCase {

    fun searchRepo()

    class Impl(private val search : SearchRepository) : SearchRepoUseCase {

        override fun searchRepo() {
            search.searchRepo()
        }
    }
}