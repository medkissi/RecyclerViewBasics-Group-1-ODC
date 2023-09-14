package com.medkissi.recyclerviewbasicsgroup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val  ANIMAL_KEY = "animal"
class MainActivity : AppCompatActivity(), OnItemClickListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = AnimalAdapter(animaux,this)
        val layoutManager = LinearLayoutManager(this )

        rv.layoutManager = layoutManager
        rv.adapter = adapter

    }

    override fun onClick(animal: Animal) {
       val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra(ANIMAL_KEY,animal)
        startActivity(intent)
    }
}