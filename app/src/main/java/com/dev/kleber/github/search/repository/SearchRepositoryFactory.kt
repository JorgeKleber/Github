package com.dev.kleber.github.search.repository

import com.dev.kleber.github.search.network.ApiFactory
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.repository.search.SearchRepository
import com.dev.kleber.github.search.repository.search.impl.SearchRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.local.SearchLocalRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.remote.SearchRemoteRepositoryImpl

object SearchRepositoryFactory {

    fun createSearchRepository(searchApi : SearchRepositoryAPI) : SearchRepository {

        var local = SearchLocalRepositoryImpl()
        var remote = SearchRemoteRepositoryImpl(searchApi)
        var impl = SearchRepositoryImpl(local, remote)

        return impl
    }
}