package com.medkissi.recyclerviewbasicsgroup1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = AnimalAdapter(animaux)
        val layoutManager = LinearLayoutManager(this )
        rv.layoutManager = layoutManager
        rv.adapter = adapter

    }
}