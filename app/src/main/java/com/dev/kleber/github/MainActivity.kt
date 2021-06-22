package com.dev.kleber.github

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.dev.kleber.github.getUser.network.GetUserApiFactory
import com.dev.kleber.github.getUser.repository.GetUserRepoFactory
import com.dev.kleber.github.getUser.usecase.GetUserUseCaseImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        var list = findViewById<RecyclerView>(R.id.my_list)
        var items = listOf("Brasil", "Canada", "Portugal")

        var adapter = ListAdapter(items, object:ItemClickCallback{
            override fun itemClick(position: Int) {

                Toast.makeText(this@MainActivity,items[position], Toast.LENGTH_SHORT).show()
            }
        })

        list.adapter = adapter

        var api = GetUserApiFactory.createSearchUserApi()
        var repository = GetUserRepoFactory.createSearchUserRepo(api)
        var getUserImpl = GetUserUseCaseImpl(repository)

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
            getUserImpl.searchUser("Jorge Kleber")

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