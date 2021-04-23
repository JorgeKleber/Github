package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.repository.search.SearchRepository

interface SearchRepoUseCase {

    fun searchRepo(language : String, sort : String)

    class Impl(private val search : SearchRepository) : SearchRepoUseCase, SearchRepoCallback {

        var numberPage = 1

        override fun searchRepo(language: String, sort: String) {
            search.searchRepo(language, sort, numberPage, this)
        }

        override fun success(result: List<Repo>) {
            numberPage++
        }

        override fun error() {

        }
    }
}