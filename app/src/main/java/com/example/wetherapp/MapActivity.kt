package com.example.wetherapp // Убедись, что тут ТВОЕ имя пакета

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wetherapp.R

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val btnBack = findViewById<Button>(R.id.btnBackFromMap)
        btnBack.setOnClickListener {
            finish() // Эта команда просто закрывает текущий экран и возвращает на предыдущий
        }
    }
}