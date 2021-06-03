package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.repository.search.SearchRepository

interface SearchRepoUseCase {

    fun searchRepo(language : String, sort : String, callback: SearchRepoCallback )

    class Impl(private val search : SearchRepository) : SearchRepoUseCase, SearchRepoCallback {

        var numberPage = 1

        override fun searchRepo(language: String, sort: String, callback: SearchRepoCallback ) {
            search.searchRepo(language, sort, numberPage, callback)
        }

        override fun success(result: List<Repo>) {
            numberPage++
        }

        override fun error() {

        }
    }
}
