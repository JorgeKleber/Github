package com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl


import com.dev.kleber.github.getUser.callback.GetUserCallback
import com.dev.kleber.github.getUser.data.User
import com.dev.kleber.github.getUser.data.isValid
import com.dev.kleber.github.getUser.network.SearchUserAPI
import com.dev.kleber.github.getUser.repository.getUser.SearchUserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchUserRemoteImpl(
    val remote : SearchUserAPI
) : SearchUserRepository {

    override fun searchUser(userName: String, callback: GetUserCallback) {

        remote.searchUser(userName)
            .enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {

                    var result = response.body()
                    result?.let { callback.sucess(it) } ?: run { callback.error() }

                    result?.let(callback::sucess)

                    response.body()?.let { callback.sucess(it) }
                    response.body().takeIf { it.isValid() }?.let {
                        callback.sucess(it)
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    callback.error()
                }
            })
    }
}