package com.example.uipractice2.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.uipractice2.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM History")
    fun getAll() : List<History>

    @Insert
    fun  insertHistory(history : History)

    @Query("DELETE FROM History WHERE keyword == :keyword")
    fun delete(keyword : String)
}