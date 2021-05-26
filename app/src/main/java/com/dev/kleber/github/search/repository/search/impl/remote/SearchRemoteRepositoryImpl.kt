package com.dev.kleber.github.search.repository.search.impl.remote

import android.util.Log
import com.dev.kleber.github.search.callback.SearchRepoCallback
import com.dev.kleber.github.search.data.Repo
import com.dev.kleber.github.search.data.SearchResult
import com.dev.kleber.github.search.network.SearchRepositoryAPI
import com.dev.kleber.github.search.repository.search.SearchRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchRemoteRepositoryImpl(
    private val service : SearchRepositoryAPI,
    )
    : SearchRepository {

    override fun searchRepo( language: String, sort: String, pageNumber: Int, callback : SearchRepoCallback ) {

        service
            .searchRepositories(language, sort, pageNumber)
            .enqueue(object : Callback<SearchResult>{
                override fun onResponse(
                    call: Call<SearchResult>,
                    response: Response<SearchResult>
                ) {
                    callback.success(response.body()?.list ?: emptyList())
                }

                override fun onFailure(call: Call<SearchResult>, t: Throwable) {
                    callback.error()
                }
            } )

        Test({

        }, 21)

        Test2(21,{})
        Test2(21){

        }
    }


    fun Test(sucess: (result: List<Repo>) -> Unit, valor : Int){
        sucess(emptyList())
        sucess.invoke(emptyList())
    }

    fun Test2(valor : Int,sucess: (result: List<Repo>) -> Unit){
        sucess(emptyList())
        sucess.invoke(emptyList())
    }
}