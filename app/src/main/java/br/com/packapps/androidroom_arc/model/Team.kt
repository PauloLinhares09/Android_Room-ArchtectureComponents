package br.com.packapps.androidroom_arc.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Team(
        @PrimaryKey val id : Long,
        val name : String,
        val since : String)