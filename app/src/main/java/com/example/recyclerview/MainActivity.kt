package com.example.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.SuperHeroAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
       // val  manager = GridLayoutManager(this, 2)
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recycle.layoutManager = LinearLayoutManager(this)
        binding.recycle.adapter = SuperHeroAdapter(
            SuperHeroProvider.superHeroList
        ) { superhero ->
            onItemSelected(superhero)
        }
        binding.recycle.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.superHero, Toast.LENGTH_SHORT).show()
    }
}