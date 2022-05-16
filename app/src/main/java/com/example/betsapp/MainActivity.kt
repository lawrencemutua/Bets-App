package com.example.betsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.betsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFootball10odds.setOnClickListener {
            val intent = Intent(this,  Football10oddsActivity::class.java )
            startActivity(intent)
        }
        binding.btnFootball3odds.setOnClickListener {
            val intent = Intent(this, Football3oddsActivity::class.java)
            startActivity(intent)
        }
        binding.btnJackpottips.setOnClickListener {
            val intent = Intent(this, JackpotActivity::class.java)
            startActivity(intent)
        }
        binding.btnOverundertips.setOnClickListener {
            val intent= Intent(this, OverUnderActivity::class.java)
            startActivity(intent)
        }
        binding.btnSafepicks.setOnClickListener {
            val intent= Intent(this, SafepicksActivity::class.java)
            startActivity(intent)
        }
        binding.btnVip.setOnClickListener {
            val intent = Intent(this, VIPActivity::class.java)
            startActivity(intent)

    }
}}