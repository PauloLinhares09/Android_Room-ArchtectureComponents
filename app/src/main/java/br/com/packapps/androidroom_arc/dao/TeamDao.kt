package br.com.packapps.androidroom_arc.dao

import android.arch.persistence.room.*
import br.com.packapps.androidroom_arc.model.Team

@Dao
interface TeamDao{

    @Query("SELECT * FROM Team ORDER BY id ASC")
    fun getAllTeams() : List<Team>

    @Query("SELECT * FROM Team WHERE Team.id = :myId")
    fun getTeam(myId: Long) : Team

    @Insert
    fun insertTeam(team: Team) : Long

    @Delete
    fun deleteTeam(team: Team)

    @Query("DELETE FROM Team")
    fun deleteAllTeams()

    @Update
    fun updateTeam(team: Team)


}