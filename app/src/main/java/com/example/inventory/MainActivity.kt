package com.example.inventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beerList = DataManager.catalogue

        var recyclerView = findViewById<RecyclerView>(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = BeerRecyclerAdapter(this, beerList)

        recyclerView.adapter = adapter

    }
}