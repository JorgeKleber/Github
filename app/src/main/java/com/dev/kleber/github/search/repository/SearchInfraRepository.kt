package com.dev.kleber.github.search.repository

import com.dev.kleber.github.search.network.SearchRepositoryInfrastructure

class SearchInfraRepository : SearchRepositoryService {

    override fun invokeGitRepository() {

        SearchRepositoryInfrastructure().invoke()

    }
}