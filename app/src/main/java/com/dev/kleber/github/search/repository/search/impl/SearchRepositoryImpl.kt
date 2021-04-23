package com.dev.kleber.github.search.repository.search.impl

import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.repository.search.SearchRepository
import retrofit2.Callback
import kotlin.properties.Delegates

class SearchRepositoryImpl (
    private val remoteRepository : SearchRepository,
    private val localRepository : SearchRepository
        ) : SearchRepository {

    override fun searchRepo(language: String, sort: String, pageNumber: Int, callback : SearchRepoCallback) {

        localRepository.searchRepo(language, sort, pageNumber, callback)
        remoteRepository.searchRepo(language,sort, pageNumber, callback)
    }


}