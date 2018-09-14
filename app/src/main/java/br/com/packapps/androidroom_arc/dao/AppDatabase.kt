package br.com.packapps.androidroom_arc.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import br.com.packapps.androidroom_arc.model.Player
import br.com.packapps.androidroom_arc.model.Team

@Database(entities = arrayOf(Team::class, Player::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun teamDao() : TeamDao
    abstract fun playerDao() : PlayerDao

    companion object {
        var INSTANCE : AppDatabase? = null

        fun getDatabaseInMemory(context: Context) : AppDatabase{
            if (INSTANCE == null) {
                INSTANCE = Room.inMemoryDatabaseBuilder(context.applicationContext, AppDatabase::class.java)
                        // To simplify, allow queries on the main thread.
                        // Don't do this on a real app! See PersistenceBasicSample for an example.
                        .allowMainThreadQueries()
                        .build()
            }
            return INSTANCE!!

        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }




}