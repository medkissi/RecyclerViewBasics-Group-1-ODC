package com.medkissi.recyclerviewbasicsgroup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.medkissi.recyclerviewbasicsgroupe2.model.President
import com.medkissi.recyclerviewbasicsgroupe2.model.presidents

const val  PRESIDENT_KEY= "president"
class PresidentActivity : AppCompatActivity(), OnPresidentClickListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_president)

        val adapter = PresidentAdapter(this )
        val linearLayoutManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.rv_president)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
        adapter.submitList(presidents)

    }

    override fun onClick(president: President) {
        val intent = Intent(this,PresidentDetailActivity::class.java)
        intent.putExtra(PRESIDENT_KEY,president)
        startActivity(intent)
    }
}