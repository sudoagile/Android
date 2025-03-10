package com.codigo.zoologicoapp.data.database
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.codigo.zoologicoapp.data.model.Animal
import com.codigo.zoologicoapp.data.model.AnimalDetail


@Dao
interface AnimalDao {
    @Query("SELECT * FROM animals")
    suspend fun getAllAnimals(): List<Animal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnimals(animals: List<Animal>)

    @Query("SELECT * FROM animal_details WHERE id = :animalId")
    suspend fun getAnimalDetail(animalId: Int): AnimalDetail?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnimalDetail(animalDetail: AnimalDetail)
}