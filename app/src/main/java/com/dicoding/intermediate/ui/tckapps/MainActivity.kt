package com.dicoding.intermediate.ui.tckapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seatsView = findViewById<SeatsView>(R.id.seats_view)
        val button = findViewById<Button>(R.id.finish_button)

        button.setOnClickListener {
            seatsView.seat?.let {
                Toast.makeText(this, "Kursi Anda nomor ${it.name}.", Toast.LENGTH_SHORT).show()
            } ?: run {
                Toast.makeText(this, "Silahkan pilih kursi terlebih dahulu.", Toast.LENGTH_SHORT).show()
            }
        }
    }

}