package com.dev.kleber.github.search.repository

import com.dev.kleber.github.search.callback.SearchRepoCallback
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
//  S - single responsability (Responsabilidade única)
//  O - Open Closed principle (Princípio do aberto e fechado)
//  L - Liskov substitution principle (Princípio de substituição de Liskov)
//  I - Interface segregation principle (Pincípio da segregação de interface)
//  D - Dependency inversion principle (Princípio da inversão de dependência)