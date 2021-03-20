package edu.itesm.kdramasappchallenge



import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kdrama(
    val picture: Int,
    val title: String,
    val year: String,
    val review:String): Parcelable
