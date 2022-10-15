package com.example.bitfit

import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context:Context = this
        val intent = Intent(context, DetailActivity::class.java)

        findViewById<Button>(R.id.foodEntryBtn).setOnClickListener {
            startActivity(intent)
        }
    }
}