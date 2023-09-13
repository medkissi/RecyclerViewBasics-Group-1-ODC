package com.medkissi.recyclerviewbasicsgroup1

import java.io.Serializable

class Animal(
    val nom: String,
    val vitesse:Int,
    val image:Int
):Serializable

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