package com.dev.kleber.github

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.dev.kleber.github.search.network.ApiFactory
import com.dev.kleber.github.search.repository.search.SearchRepository
import com.dev.kleber.github.search.repository.search.impl.SearchRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.local.SearchLocalRepositoryImpl
import com.dev.kleber.github.search.repository.search.impl.remote.SearchRemoteRepositoryImpl

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        var local = SearchLocalRepositoryImpl()
        var aux = ApiFactory()
        var remote = SearchRemoteRepositoryImpl(aux.createSearchRepositoryAPI())

        var impl = SearchRepositoryImpl(local, remote)

        val function: (v: View) -> Unit = { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

            impl.searchRepo()
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