package com.dev.kleber.github.getUser.presentation

import com.dev.kleber.github.getUser.GetUserContract
import com.dev.kleber.github.getUser.network.GetUserApiFactory
import com.dev.kleber.github.getUser.repository.GetUserRepoFactory
import com.dev.kleber.github.getUser.usecase.GetUserUseCaseImpl

object GetUserPresentationFactory {
    fun createUserPresentation(view : GetUserContract.View) : GetUserPresentation {

        val api = GetUserApiFactory.createSearchUserApi()
        val repository = GetUserRepoFactory.createSearchUserRepo(api)
        val usecase = GetUserUseCaseImpl(repository)
        return GetUserPresentation(view, usecase)
    }
}