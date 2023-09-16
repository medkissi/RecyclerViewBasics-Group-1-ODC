package com.medkissi.recyclerviewbasicsgroup1.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.medkissi.recyclerviewbasicsgroup1.adapters.AnimalAdapter
import com.medkissi.recyclerviewbasicsgroup1.adapters.OnItemClickListner
import com.medkissi.recyclerviewbasicsgroup1.R
import com.medkissi.recyclerviewbasicsgroup1.data.model.Animal
import com.medkissi.recyclerviewbasicsgroup1.viewmodel.AnimalViewModel

const val ANIMAL_KEY = "animal"

class MainActivity : AppCompatActivity(), OnItemClickListner {

    val viewModel: AnimalViewModel by viewModels()
    lateinit var adapter: AnimalAdapter
    lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rv = findViewById(R.id.rv)

        viewModel.animaux.observe(this) { animaux ->
            adapter = AnimalAdapter(animaux, this)
            rv.adapter = adapter


        }

        val layoutManager = LinearLayoutManager(this)

        rv.layoutManager = layoutManager

    }

    override fun onClick(animal: Animal) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(ANIMAL_KEY, animal)
        startActivity(intent)
    }


}