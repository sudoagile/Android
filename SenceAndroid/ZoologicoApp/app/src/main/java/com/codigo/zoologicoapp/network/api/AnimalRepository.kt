package com.codigo.zoologicoapp.network.api

import retrofit2.http.GET
import retrofit2.http.Path
import com.codigo.zoologicoapp.data.model.Animal
import com.codigo.zoologicoapp.data.model.AnimalDetail

interface ZooApiService {
    @GET("https://zoo-api.vercel.app/es/animales")
    suspend fun getAnimals(): List<Animal>

    @GET("https://zoo-api.vercel.app/es/animales/{id}")
    suspend fun getAnimalDetail(@Path("id") id: Int): AnimalDetail
}