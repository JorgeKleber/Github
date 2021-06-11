package com.dev.kleber.github.search.presenter

import android.provider.CallLog
import com.dev.kleber.github.search.SearchContract
import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.presentation.SearchPresenter
import com.dev.kleber.github.search.usecase.SearchRepoUseCase
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import io.mockk.verifyAll
import org.junit.Before
import org.junit.Test

class SearchPresenterTest {

    var view = mockk<SearchContract.View>()
    var usecase = mockk<SearchRepoUseCase>()
    lateinit var presenter : SearchContract.Presenter

    @Before
    fun setup(){
        presenter = SearchPresenter(view, usecase)
    }

    @Test
    fun test(){

        //every { usecase.searchRepo("language:kotlin","stars",callback) } returns

        presenter.search("language:kotlin")

        verifyAll { view.showLoading() }

    }

    @Test(expected = NotImplementedError::class)
    fun testSample(){
        presenter.loadingMore()
    }
}