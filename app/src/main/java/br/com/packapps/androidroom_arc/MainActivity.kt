package br.com.packapps.androidroom_arc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import br.com.packapps.androidroom_arc.dao.AppDatabase

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    var db : AppDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        db = AppDatabase.getDatabaseInMemory(applicationContext)

        initRecycleView()

//        PopulateDatabaseExample.insertTeams(db!!)
        PopulateDatabaseExample.insertPlayers(db!!)


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
