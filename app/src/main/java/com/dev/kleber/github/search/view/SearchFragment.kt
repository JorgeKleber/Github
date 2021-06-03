package com.dev.kleber.github.search.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.kleber.github.R
import com.dev.kleber.github.search.SearchContract
import com.dev.kleber.github.search.presentation.PresenterFactory
import com.dev.kleber.github.search.presentation.PresenterFactory.createSearchPresenter
import com.dev.kleber.github.search.presentation.SearchPresenter


class SearchFragment : Fragment(), SearchContract.View {

    private val presenter = createSearchPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.search("")
    }

    override fun showResults() {

    }

    override fun hideResults() {
        TODO("Not yet implemented")
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun showNetworkError() {
        TODO("Not yet implemented")
    }

    override fun hideNetworkError() {
        TODO("Not yet implemented")
    }

    override fun showEmptyState() {
        TODO("Not yet implemented")
    }

    override fun hideEmptyState() {
        TODO("Not yet implemented")
    }
}