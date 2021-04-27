package com.dev.kleber.github.pullRequest.repository.pullRequest.impl.remoto

import com.dev.kleber.github.pullRequest.callBack.PullRequestCallBack
import com.dev.kleber.github.pullRequest.data.Pull
import com.dev.kleber.github.pullRequest.data.PullResult
import com.dev.kleber.github.pullRequest.network.PullRepositoryAPI
import com.dev.kleber.github.pullRequest.repository.pullRequest.PullRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemotePullImpl (var pullRepo : PullRepositoryAPI) : PullRepository {

    override fun getPull(owner: String, repositoryName: String, callback: PullRequestCallBack) {
        pullRepo
            .pullRequestRepository(owner, repositoryName)
            .enqueue(object : Callback<PullResult>{
                override fun onResponse(
                    call: Call<PullResult>,
                    response: Response<PullResult>
                ) {
                    callback.sucesso(response.body()?.result ?: emptyList())
                }

                override fun onFailure(call: Call<PullResult>, t: Throwable) {
                    callback.error()
                }
            }
    }

}