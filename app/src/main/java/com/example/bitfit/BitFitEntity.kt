package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "bitFit_table")
data class BitFitEntity(
    @ColumnInfo(name = "food") val food: String?,
    @ColumnInfo (name = "calories") val calories: Float?
)