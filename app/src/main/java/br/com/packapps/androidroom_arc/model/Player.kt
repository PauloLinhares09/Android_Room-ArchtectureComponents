package br.com.packapps.androidroom_arc.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "player", foreignKeys = arrayOf(ForeignKey(entity = Team::class, parentColumns = arrayOf("id"), childColumns = arrayOf("team_id"))))
class Player(
        @PrimaryKey val id : Long,
        name : String,
        @ColumnInfo(name="good_foot") val goodFoot : String,
        @ColumnInfo(name = "team_id") val teamId : String)