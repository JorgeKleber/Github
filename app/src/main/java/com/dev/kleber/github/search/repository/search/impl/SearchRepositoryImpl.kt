package com.dev.kleber.github.search.repository.search.impl

import com.dev.kleber.github.search.repository.search.SearchRepository

class SearchRepositoryImpl (
    private val remoteRepository : SearchRepository,
    private val localRepository : SearchRepository
        ) : SearchRepository {

    override fun searchRepo() {
        localRepository.searchRepo()
        remoteRepository.searchRepo()
    }
}