package com.medkissi.recyclerviewbasicsgroup1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.medkissi.recyclerviewbasicsgroup1.R
import com.medkissi.recyclerviewbasicsgroupe2.model.President

class PresidentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_president_detail)

        val image = findViewById<ImageView>(R.id.detail_image_president)
        val nom = findViewById<TextView>(R.id.detail_president_nom)
        val pays = findViewById<TextView>(R.id.detail_president_pays)
        val biographie = findViewById<TextView>(R.id.biographie)
        val data = intent.getSerializableExtra(PRESIDENT_KEY) as President

        image.setImageResource(data.photo)
        nom.text = data.nom
        pays.text = data.pays
        biographie.text = data.biographie
    }
}