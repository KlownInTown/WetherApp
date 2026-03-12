package com.example.wetherapp 

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wetherapp.R

class FavoritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        val btnBack = findViewById<Button>(R.id.btnBackFromFav)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
