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
    var listData : MutableList<String> = mutableListOf()
    private lateinit var adapter: MyRecycleViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        db = AppDatabase.getDatabaseInMemory(applicationContext)

        initRecycleView()

        PopulateDatabaseExample.insertTeams(db!!)
        PopulateDatabaseExample.insertPlayers(db!!)


    }


    fun initRecycleView() {
        adapter = MyRecycleViewAdapter(this)

        rcData.layoutManager = LinearLayoutManager(this)
        rcData.adapter = adapter
    }


    fun btSeeTeams(view: View){
        val listTeams = db!!.teamDao().getAllTeams()
        if (listTeams != null){
            for (t in listTeams){
                listData.add(t.name)
            }

            adapter.listData = listData
            adapter.notifyDataSetChanged()
        }
    }

    fun btSeePlayers(view: View){

    }

    fun btSeeJustPlayersOfFlamengo(view: View){

    }

}
