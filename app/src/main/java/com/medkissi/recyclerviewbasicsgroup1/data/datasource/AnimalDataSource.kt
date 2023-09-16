package com.medkissi.recyclerviewbasicsgroup1.data.datasource

import com.medkissi.recyclerviewbasicsgroup1.R
import com.medkissi.recyclerviewbasicsgroup1.data.model.Animal

class AnimalDataSource(){

    val animaux = listOf<Animal>(
        Animal("Lion",54, R.drawable.lion),
        Animal("Tigre",46, R.drawable.tigre),
        Animal("Leopard",86, R.drawable.leopard),
        Animal("Guepard",80, R.drawable.guepard),
        Animal("Cougar",53, R.drawable.cougar),
        Animal("Lynx",60, R.drawable.lynx),
        Animal("Chat",20, R.drawable.chat),
        Animal("Jaguar",70, R.drawable.jaguar),
    )
}