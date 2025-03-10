package com.codigo.zoologicoapp.data.repository

import com.codigo.zoologicoapp.data.database.AnimalDao
import com.codigo.zoologicoapp.data.model.Animal
import com.codigo.zoologicoapp.data.model.AnimalDetail
import com.codigo.zoologicoapp.network.api.ZooApiService

class AnimalRepository(private val api: ZooApiService, private val dao: AnimalDao) {

    suspend fun getAnimals(): List<Animal> {
        val animals = api.getAnimals()
        dao.insertAnimals(animals)
        return dao.getAllAnimals()
    }

    suspend fun getAnimalDetail(animalId: Int): AnimalDetail? {
        val detail = api.getAnimalDetail(animalId)
        dao.insertAnimalDetail(detail)
        return dao.getAnimalDetail(animalId)
    }
}