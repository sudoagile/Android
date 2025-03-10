package com.codigo.zoologicoapp.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codigo.zoologicoapp.data.repository.AnimalRepository
import kotlinx.coroutines.launch

class AnimalViewModel(private val repository: AnimalRepository) : ViewModel() {

    fun loadAnimals() {
        viewModelScope.launch {
            repository.getAnimals()
        }
    }

    fun loadAnimalDetail(id: Int) {
        viewModelScope.launch {
            repository.getAnimalDetail(id)
        }
    }
}