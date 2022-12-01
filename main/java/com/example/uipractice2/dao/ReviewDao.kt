package com.example.uipractice2.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.uipractice2.model.Review

@Dao
interface ReviewDao {

    @Query("SELECT * FROM Review WHERE id = :id")
    fun getOneReview(id : Int) : List<Review>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveReview(review : Review)
}