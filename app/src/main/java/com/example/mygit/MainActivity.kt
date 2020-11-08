package com.example.mygit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "laptop line 1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "mycomputer line 1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "mycomputer line 2", Toast.LENGTH_SHORT).show()
    }
}