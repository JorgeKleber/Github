package com.dev.kleber.github.pullRequest.callBack

import com.dev.kleber.github.pullRequest.data.Pull

interface PullRequestCallBack {

    fun sucess(result : List<Pull>)
    fun error()
}