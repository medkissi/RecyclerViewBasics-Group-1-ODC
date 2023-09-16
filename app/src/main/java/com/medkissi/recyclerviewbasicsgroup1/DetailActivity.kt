package com.medkissi.recyclerviewbasicsgroup1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.medkissi.recyclerviewbasicsgroup1.data.model.Animal

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val image = findViewById<ImageView>(R.id.imageView2)
        val nom = findViewById<TextView>(R.id.nom)
        val vitesse = findViewById<TextView>(R.id.vitesse)

        val data = intent.getSerializableExtra(ANIMAL_KEY) as Animal

        image.setImageResource(data.image)
        nom.text = data.nom
        vitesse.text = "${data.vitesse} km/h"

    }
}