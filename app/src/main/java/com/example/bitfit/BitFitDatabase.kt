package com.example.bitfit

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BitFitEntity::class], version = 1)
abstract class BitFitDatabase: RoomDatabase() {

    abstract fun bitFitDao(): bitFitDao

    companion object{

        @Volatile
        private var INSTANCE: BitFitDatabase? = null

        fun getInstance(context: Context): BitFitDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also {INSTANCE = it}
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                BitFitDatabase::class.java, "BitFit-db"
            ).build()
    }
}