package com.dev.kleber.github.search.repository.search.impl.local

import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.repository.search.SearchRepository

class SearchLocalRepositoryImpl : SearchRepository {

    override fun searchRepo(language: String,
                            sort: String,
                            pageNumber: Int,
                            callback : SearchRepoCallback) {
    }
}