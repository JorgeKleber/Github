package com.dev.kleber.github.search.repository.search

interface SearchRepository {

    fun searchRepo(language : String, sort : String, pageNumber : Int)

}