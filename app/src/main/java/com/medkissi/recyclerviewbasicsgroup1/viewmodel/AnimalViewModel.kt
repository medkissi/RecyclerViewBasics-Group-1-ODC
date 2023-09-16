package com.medkissi.recyclerviewbasicsgroup1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.medkissi.recyclerviewbasicsgroup1.data.model.Animal
import com.medkissi.recyclerviewbasicsgroup1.data.repository.AnimalRepository

class AnimalViewModel:ViewModel() {
    val repository = AnimalRepository()

    private val _animaux = MutableLiveData<List<Animal>>()

    val animaux:LiveData<List<Animal>> = _animaux

    init {
        getAnimaux()
    }



    fun getAnimaux(){

        _animaux.value = repository.getAnimaux()
    }


}
