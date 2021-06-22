package com.dev.kleber.github.getUser

interface GetUserContract {

    interface View{
        fun showResults()
        fun showLoading()
        fun showErrorMessage()
        fun showNetworkError()
    }

    interface Presenter{
        fun getUser(userName : String)
    }
}