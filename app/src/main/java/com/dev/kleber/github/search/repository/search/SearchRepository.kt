package com.dev.kleber.github.search.repository.search

import com.dev.kleber.github.search.callback.SearchRepoCallback

interface SearchRepository {

    fun searchRepo(language : String, sort : String, pageNumber : Int, callback : SearchRepoCallback)
}