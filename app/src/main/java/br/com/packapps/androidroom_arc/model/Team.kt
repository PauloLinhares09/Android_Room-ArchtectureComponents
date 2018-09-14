package br.com.packapps.androidroom_arc.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "team")
class Team(
        @PrimaryKey(autoGenerate = true) var id : Long?,
        @ColumnInfo(name = "name") var name : String,
        @ColumnInfo(name = "since") var since : String){



    constructor() : this(null, "", "")
}