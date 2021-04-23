package com.dev.kleber.github.search.callback

import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.data.SearchResult

interface SearchRepoCallback {

    fun success(result: List<Repo>)
    fun error()

}