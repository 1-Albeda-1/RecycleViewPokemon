package com.example.recycleviewpokemon

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleviewpokemon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
    private val imageIdList = listOf(
        R.drawable.pok_001,
        R.drawable.pok_002,
        R.drawable.pok_003,
        R.drawable.pok_004,
        R.drawable.pok_005,
        R.drawable.pok_006,
        R.drawable.pok_007,
        R.drawable.pok_008,
        R.drawable.pok_009,
        R.drawable.pok_010,
        R.drawable.pok_011,
        R.drawable.pok_012,
        R.drawable.pok_013,
        R.drawable.pok_014,
        R.drawable.pok_015,
        R.drawable.pok_016,
        R.drawable.pok_017,
        R.drawable.pok_018,
        R.drawable.pok_019,
        R.drawable.pok_020,
        R.drawable.pok_021,
        R.drawable.pok_022,
        R.drawable.pok_023,
        R.drawable.pok_024,
        R.drawable.pok_025,
        R.drawable.pok_026,
        R.drawable.pok_027,
        R.drawable.pok_028,
        R.drawable.pok_029,
        R.drawable.pok_030,
        R.drawable.pok_031,
        R.drawable.pok_032,
        R.drawable.pok_033,
        R.drawable.pok_034,
        R.drawable.pok_035,
        R.drawable.pok_036,
        R.drawable.pok_037,
        R.drawable.pok_038,
        R.drawable.pok_039,
        R.drawable.pok_040,
    )
    private val NameList = listOf(
        "Bulbasaur",
        "Ivysaur",
        "Venasaur",
        "Charmader",
        "Pidgeotto",
        "Pidgeot",
        "Rattata",
        "Raticate",
        "Nidorino",
        "Nidoking",
        "Charmilion",
        "Charizard",
        "Squirtle",
        "Wartortle",
        "Spearow",
        "Fearow",
        "Ekans",
        "Arbok",
        "Clefairy",
        "Clefable",
        "Blastoise",
        "Caterpie",
        "Metapod",
        "Pikachu",
        "Raichu",
        "Sandshrew",
        "Sandslash",
        "Vulpix",
        "Ninetales",
        "Weedle",
        "Kakuna",
        "Beedrill",
        "Pidgey",
        "Nidoran",
        "Nidorina",
        "Nidoqueen",
        "Nidoran",
        "Jigglypuff",
        "Wigglytuff",
    )
    private var indexImg = 0
    private var indexName = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init(){
        binding.apply{
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            btnAdd.setOnClickListener{
                if (indexImg > 39 && indexName > 39)
                    indexImg = 0
                    var plant = Plant(imageIdList[indexImg], NameList[indexName])
                    adapter.addPlant(plant)
                    indexImg++
                    indexName++
                }
            }
        } }
