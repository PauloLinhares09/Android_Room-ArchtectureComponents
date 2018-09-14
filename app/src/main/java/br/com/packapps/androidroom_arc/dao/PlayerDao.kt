package br.com.packapps.androidroom_arc.dao

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.IGNORE
import br.com.packapps.androidroom_arc.model.Player

@Dao
interface PlayerDao{
    @Query("SELECT * FROM Player ORDER BY id ASC")
    fun getAllTeams() : List<Player>

    @Query("SELECT * FROM Player WHERE Player.id = :myId")
    fun getPlayer(myId: Long) : Player

    @Insert(onConflict = IGNORE)
    fun insertPlayer(team: Player) : Long

    @Delete
    fun deletePlayer(team: Player)

    @Query("DELETE FROM Player")
    fun deleteAllPlayers()

    @Update
    fun updatePlayer(team: Player)
}