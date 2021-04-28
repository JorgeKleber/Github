package com.dev.kleber.github.pullRequest.callBack

import com.dev.kleber.github.pullRequest.data.Pull

interface PullRequestCallBack {

    fun sucesso(result : List<Pull>)
    fun error()
}