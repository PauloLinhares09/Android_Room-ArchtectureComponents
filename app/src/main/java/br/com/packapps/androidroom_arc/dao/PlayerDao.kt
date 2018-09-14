package br.com.packapps.androidroom_arc.dao

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import br.com.packapps.androidroom_arc.model.Player

interface PlayerDao{
    @Query("SELECT * FROM Player ORDER BY id ASC")
    fun getAllTeams() : List<Player>

    @Query("SELECT * FROM Player WHERE Player.id = :myId")
    fun getPlayer(myId: Long) : Player

    @Insert
    fun insertPlayer(team: Player) : Long

    @Delete
    fun deletePlayer(team: Player)

    @Query("DELETE FROM Player")
    fun deleteAllPlayers()

    @Update
    fun updatePlayer(team: Player)
}