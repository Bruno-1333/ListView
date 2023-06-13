package com.brunoleonardo.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.brunoleonardo.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding pour lier le layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // binding pour lier le layout
        setContentView(binding.root) // binding pour lier le layout

        var tabPays: Array<String> = arrayOf("Canada", "USA", "Tunisie","Bresil", "Italie ", "Inde ", "France", "Espagne ", "Maroc ", "Potugal ", "Algérie " ) // tableau de pays

        var paysAdapter: ArrayAdapter<String> = // adapter pour afficher le tableau de pays
            ArrayAdapter(this, android.R.layout.simple_list_item_1, tabPays) // adapter pour afficher le tableau de pays dans une liste simple

        binding.list2.adapter = paysAdapter // binding pour lier le layout

        binding.list2.setOnItemClickListener { parent, view, position, id -> // creation d'un listener pour la liste
            var donnee = binding.list2.getItemAtPosition(position).toString() // recupere la donnee selectionnee
            Toast.makeText(this, "pays: $donnee", Toast.LENGTH_SHORT).show() // affiche la donnee selectionnee
        } //


    }


}