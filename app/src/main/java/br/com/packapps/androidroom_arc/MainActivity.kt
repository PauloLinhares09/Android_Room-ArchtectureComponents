package br.com.packapps.androidroom_arc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        initRecycleView()


    }

    fun initRecycleView() {
        rcData.layoutManager = LinearLayoutManager(this)
        rcData.adapter = MyRecycleViewAdapter(this)
    }


    fun btSeeTeams(view: View){

    }

    fun btSeePlayers(view: View){

    }

    fun btSeeJustPlayersOfFlamengo(view: View){

    }

}
