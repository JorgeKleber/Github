package com.dev.kleber.github.search.usecase

import com.dev.kleber.github.search.repository.search.SearchRepository
import io.mockk.mockk
import org.junit.Before
import org.junit.Test

class UsecaseTest {

    @Before
    fun setup(){
        val searchRepo = mockk<SearchRepository>()
        val usecase = SearchRepoUseCase.Impl(searchRepo)
    }

    @Test
    fun test(){

    }

    @Test
    fun `test 2`(){

    }
}