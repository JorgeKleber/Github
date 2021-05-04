package com.dev.kleber.github

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dev.kleber.github.getUser.network.SearchUserApiFactory
import com.dev.kleber.github.getUser.repository.SearchUserRepoFactory
import com.dev.kleber.github.getUser.repository.getUser.impl.remoteImpl.SearchUserRepositoryImpl
import com.dev.kleber.github.pullRequest.network.PullRequestAPIFactory
import com.dev.kleber.github.pullRequest.repository.PullRequestRepoFactory
import com.dev.kleber.github.pullRequest.usecase.PullRequestUseCaseImpl
import com.dev.kleber.github.search.network.ApiFactory
import com.dev.kleber.github.search.repository.SearchRepositoryFactory
import com.dev.kleber.github.search.repository.search.impl.SearchRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.local.SearchLocalRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.remote.SearchRemoteRepositoryImpl
import com.dev.kleber.github.search.usecase.SearchRepoUseCase
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

//        var searchRepoApi = ApiFactory.createSearchRepositoryAPI()
//        var searchRepository = SearchRepositoryFactory.createSearchRepository(searchRepoApi)
//
//        var impl = SearchRepoUseCase.Impl(searchRepository)

//        var pullApi = PullRequestAPIFactory.createPullRequestAPI()
//        var repository = PullRequestRepoFactory.createPullRequestRepo(pullApi)
//
//        var impl = PullRequestUseCaseImpl(repository)

        val function: (v: View) -> Unit = { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

            //impl.searchRepo("language:kotlin","stars")

            //impl.getPullRequest("JorgeKleber","github")
        }
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener(function)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}