package com.medkissi.recyclerviewbasicsgroup1.data.repository

import com.medkissi.recyclerviewbasicsgroup1.data.datasource.AnimalDataSource
import com.medkissi.recyclerviewbasicsgroup1.data.model.Animal

class AnimalRepository {
    val animalDataSource = AnimalDataSource()


    fun getAnimaux():List<Animal>{
        return animalDataSource.animaux

    }
}