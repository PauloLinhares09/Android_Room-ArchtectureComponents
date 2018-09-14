package br.com.packapps.androidroom_arc

import br.com.packapps.androidroom_arc.dao.AppDatabase
import br.com.packapps.androidroom_arc.dao.TeamDao
import br.com.packapps.androidroom_arc.model.Team


class PopulateDatabaseExample{

    companion object {
        fun insertTeams(db : AppDatabase){
            val listTeams = mutableListOf<Team>()
            listTeams.add(Team(1, "Flamengo", "1895"))
            listTeams.add(Team(2, "Real Madrid", "1902"))
            listTeams.add(Team(3, "Barcelona", "1899"))

            db.teamDao().insertOrReplaceTeams(listTeams.get(0), listTeams.get(1), listTeams.get(2))

        }
    }



}