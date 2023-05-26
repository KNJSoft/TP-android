package com.knjsoft.tp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var nom:TextView
    private lateinit var prenom:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        nom=findViewById(R.id.nom)
        prenom=findViewById(R.id.prenom)
        val personne=if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            intent.getSerializableExtra("personne",Personne::class.java)
        }else{
            intent.getSerializableExtra("personne") as Personne?
        }
        nom.text=personne!!.nom
        prenom.text=personne.prenom

    }
}