package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface bitFitDao{
    @Query("SELECT * FROM bitFit_table")
    fun getAll(): Flow<List<BitFitEntity>>

    @Insert
    fun insertAll(bitFits: List<BitFitEntity>)

    @Query("DELETE FROM bitFit_table")
    fun deleteAll()
}