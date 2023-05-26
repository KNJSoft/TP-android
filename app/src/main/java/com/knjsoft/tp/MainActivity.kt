package com.knjsoft.tp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var go:Button
    private lateinit var personne: Personne
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        go=findViewById(R.id.go)
        personne=Personne("KNJ","Soft")
        go.setOnClickListener{
            Intent(this@MainActivity,MainActivity2::class.java).also {
                it.putExtra("personne",personne)
                startActivity(it)
            }
        }
    }
}