package com.codigo.zoologicoapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animals")
data class Animal(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val species: String,
    val habitat: String,
    val diet: String,
    val image: String
)