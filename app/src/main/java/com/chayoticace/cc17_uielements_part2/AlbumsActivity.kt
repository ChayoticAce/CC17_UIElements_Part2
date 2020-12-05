package com.chayoticace.cc17_uielements_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView

var albumSongs = ArrayList<String>()
var albumURI = String

class AlbumsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_albums)

        //Map the Grid View
        val GridView = findViewById<GridView>(R.id.gridView) as GridView
        //Attach the adapter to the Grid View
        GridView.adapter = ImageAdapter(applicationContext)
        //Item click listener for the Grid View
        GridView.onItemClickListener = AdapterView.OnItemClickListener { parent, v, position, id ->
            val intent = Intent(this, AlbumDetailsActivity::class.java)
            var uri: String
            if (position == 0) {
                uri = "@drawable/gorillaz"
                albumSongs.clear()
                albumSongs.addAll(resources.getStringArray(R.array.gorillaz))
            } else if (position == 1) {
                uri = "@drawable/kendrick"
                albumSongs.clear()
                albumSongs.addAll(resources.getStringArray(R.array.kendrick))
            } else {
                uri = "@drawable/prototype_2"
                albumSongs.clear()
                albumSongs.addAll(resources.getStringArray(R.array.prototype))
            }
            intent.putExtra("imageUri", uri)
            startActivity(intent)
        }
    }
}