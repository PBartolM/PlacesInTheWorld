package com.example.placesintheworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.DefaultItemAnimator

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Places>()
        items.add(Places(R.drawable.image1,"Card 1"))
        items.add(Places(R.drawable.image2,"Card 2"))
        items.add(Places(R.drawable.image3,"Card 3"))
        items.add(Places(R.drawable.image4,"Card 4"))
        items.add(Places(R.drawable.image5,"Card 5"))
        items.add(Places(R.drawable.image6,"Card 6"))
        items.add(Places(R.drawable.image7,"Card 7"))
        items.add(Places(R.drawable.image8,"Card 8"))
        items.add(Places(R.drawable.image9,"Card 9"))

        val recView = findViewById<RecyclerView>(R.id.recicler)
        val adaptador = PlacesAdapter(items)
        recView.setHasFixedSize(true)
        recView.itemAnimator = DefaultItemAnimator()


        recView.adapter = adaptador
        recView.layoutManager=StaggeredGridLayoutManager(2,1)

            adaptador.onClick = {


        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }
//TODO: settings tiene que llevar al layout 2

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            (R.id.information) -> {lanzarPoints()
                return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }

    private fun lanzarPoints (){
        val i = Intent(this,PointsOfInterest::class.java)
        startActivity(i)
    }
}
