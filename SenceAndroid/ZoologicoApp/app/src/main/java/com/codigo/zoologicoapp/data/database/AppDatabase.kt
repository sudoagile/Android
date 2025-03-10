package com.codigo.zoologicoapp.data.database


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.codigo.zoologicoapp.data.model.Animal
import com.codigo.zoologicoapp.data.model.AnimalDetail

@Database(entities = [Animal::class, AnimalDetail::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class) // 🔹 Asegúrate de incluir esto
abstract class AppDatabase : RoomDatabase() {
    abstract fun animalDao(): AnimalDao
}
