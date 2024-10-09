package com.dicoding.myrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dicoding.myrecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hero = intent.getParcelableExtra<Hero>("extra_hero") as Hero
        binding.tvDetailName.text = hero.name
        binding.tvDetailDescription.text = hero.description

        Glide.with(this)
            .load(hero.photo)
            .into(binding.imgDetailPhoto)
    }
}
