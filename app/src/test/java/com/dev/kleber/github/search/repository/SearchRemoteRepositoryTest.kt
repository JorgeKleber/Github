package com.dev.kleber.github.search.repository

import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.repository.search.SearchRepository
import com.dev.kleber.github.search.repository.search.impl.remote.SearchRemoteRepositoryImpl
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.hamcrest.CoreMatchers.any
import org.junit.Before
import org.junit.Test
import retrofit2.Call
import retrofit2.Response
import retrofit2.mock.Calls

class SearchRemoteRepositoryTest {

    val api = mockk<SearchRepositoryAPI>(relaxed = true)
    val callback = mockk<SearchRepoCallback>(relaxed = true)
    lateinit var remoteRepository : SearchRepository

    @Before
    fun setup(){

        remoteRepository = SearchRemoteRepositoryImpl(api)
    }

    @Test
    fun test(){

        var emptyList = emptyList<Repo>()

        every { api.searchRepositories("language:kotlin", "stars", 1) } returns Calls.response(SearchResult(emptyList))

        remoteRepository.searchRepo("language:kotlin", "stars", 1,callback)

        verify { callback.success(emptyList)  }
    }

    @Test
    fun `test remote repository error`(){

        var emptyList = emptyList<Repo>()

        every { api.searchRepositories("language:kotlin", "stars", 1) } returns Calls.failure(Throwable())

        remoteRepository.searchRepo("language:kotlin", "stars", 1,callback)

        verify { callback.error()  }
    }
}