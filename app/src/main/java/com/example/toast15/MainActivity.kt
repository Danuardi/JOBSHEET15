package com.example.toast15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Terbuka", Toast.LENGTH_SHORT).show()

        val tombol1 = findViewById<Button>(R.id.tombolNAMA)
        val tombol2 = findViewById<Button>(R.id.tombolKELAS)
        val tombol3 = findViewById<Button>(R.id.tombolNIS)

        tombol1.setOnClickListener {
            Toast.makeText(this, "Danuardi W.P.L", Toast.LENGTH_SHORT).show()
        }
            tombol2.setOnClickListener {
                Toast.makeText(this, "XI PPLG2", Toast.LENGTH_SHORT).show()
            }
                tombol3.setOnClickListener {
                    Toast.makeText(this, "2981", Toast.LENGTH_SHORT).show()
                }
    }
}