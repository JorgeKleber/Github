package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.repository.search.SearchRepository

interface SearchRepoUseCase {

    fun searchRepo(language : String, sort : String, pageNumber : Int)

    class Impl(private val search : SearchRepository) : SearchRepoUseCase {

        override fun searchRepo(language: String, sort: String, pageNumber: Int) {
            search.searchRepo(language, sort, pageNumber)
        }
    }
}