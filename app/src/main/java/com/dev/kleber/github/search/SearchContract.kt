package com.dev.kleber.github.search

interface SearchContract {

    interface View {
        fun showResults()
    }

    interface Presenter {
        fun load()
    }
}