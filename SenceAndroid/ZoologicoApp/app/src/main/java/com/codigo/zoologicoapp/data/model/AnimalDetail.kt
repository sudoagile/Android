package com.codigo.zoologicoapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animal_details")
data class AnimalDetail(
    @PrimaryKey val id: Int,
    val description: String,
    val estadoDeConservacion: String,
    val esperanzaDeVida: String,
    val pesoPromedio: String,
    val alturaPromedio: String,
    val datosCuriosos: List<String>, // Ahora Room puede guardarlo
    val comidasFavoritas: List<String>,
    val predadoresNaturales: List<String>
)