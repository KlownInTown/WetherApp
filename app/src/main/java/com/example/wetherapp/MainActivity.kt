package com.example.wetherapp // Тут будет твое имя пакета

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wetherapp.FavoritesActivity
import com.example.wetherapp.MapActivity
import com.example.wetherapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим кнопки по их ID из XML
        val btnMap = findViewById<Button>(R.id.btnMap)
        val btnFavorites = findViewById<Button>(R.id.btnFavorites)

        // Переход на экран карты
        btnMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }

        // Переход на экран избранного
        btnFavorites.setOnClickListener {
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
        }
    }
}