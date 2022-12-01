package com.example.uipractice2.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book (
    @SerializedName("itemId") val id:Long,
    @SerializedName("title") val title:String,
    @SerializedName("description") val dexcription:String,
    @SerializedName("coverSmallUrl") val coverSmallUrl:String,
) : Parcelable