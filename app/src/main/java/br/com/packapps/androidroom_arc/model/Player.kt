package br.com.packapps.androidroom_arc.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "player", foreignKeys = arrayOf(ForeignKey(entity = Team::class, parentColumns = arrayOf("id"), childColumns = arrayOf("team_id"))))
class Player(@PrimaryKey(autoGenerate = true)
             @ColumnInfo(name = "id") var id : Long?,
             @ColumnInfo(name = "name") var name : String,
             @ColumnInfo(name="good_foot") var goodFoot : String,
             @ColumnInfo(name = "team_id") var teamId : Long?){


    constructor() : this(null, "", "", null)


}