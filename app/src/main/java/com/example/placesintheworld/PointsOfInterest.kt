package com.example.placesintheworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.activity_points_of_interest.*
import android.widget.Toast




class PointsOfInterest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_points_of_interest)
        val cosas = arrayOf("Aventures", "Guided visits", "Trekking")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, cosas)

        val list_cosas = findViewById(R.id.spinner) as Spinner
        list_cosas.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val chipGroup = findViewById(R.id.chip_group) as ChipGroup

        chipGroup.setOnCheckedChangeListener(object : ChipGroup.OnCheckedChangeListener {

            override fun onCheckedChanged(group: ChipGroup, checkedId: Int) {
                val checkedChip = group.findViewById<Chip>(checkedId)
                var option = checkedChip.text as String
                Toast.makeText(applicationContext,option,Toast.LENGTH_SHORT).show()

            }
        })
        val bottomAppBar = findViewById(R.id.bottom_appbar) as BottomAppBar
        bottomAppBar.replaceMenu(R.menu.menu_main)
    }
}