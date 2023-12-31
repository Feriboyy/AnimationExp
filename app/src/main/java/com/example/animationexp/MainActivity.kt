package com.example.animationexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationexp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(GameView(this))
        
        setContentView(binding.root)
        val gameView = GameView(this)
        val container = binding.root
        container.addView(gameView)
    }
}