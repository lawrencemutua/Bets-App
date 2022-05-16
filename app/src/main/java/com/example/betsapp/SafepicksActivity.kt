package com.example.betsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.betsapp.databinding.ActivitySafepicksBinding
import com.example.betsapp.adapter.SafePicksAdapter
import com.example.betsapp.models.Football
import com.google.firebase.firestore.FirebaseFirestore

class SafepicksActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySafepicksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySafepicksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Safe Picks"
        actionBar.setDisplayHomeAsUpEnabled(true)

        binding.recyclerSafepicks.apply {
            layoutManager = LinearLayoutManager(this@SafepicksActivity)
        }

        fetchsafepicksgames()

    }

    private fun fetchsafepicksgames() {
        FirebaseFirestore.getInstance().collection("SAFE-PICKS")
            .get()
            .addOnSuccessListener { documents ->
                run {
                    for (document in documents) {
                        val FootballList = documents.toObjects(Football::class.java)
                        binding.recyclerSafepicks.adapter = SafePicksAdapter(this,FootballList)

                    }
                }
            }
            .addOnFailureListener {
                showToast("There is an Error: ${it.localizedMessage}")
            }}}