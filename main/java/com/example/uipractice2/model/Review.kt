package com.example.uipractice2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Review (
    @PrimaryKey(autoGenerate = true)val id : Int = 0,
    @ColumnInfo(name = "review") val review : String?
)
