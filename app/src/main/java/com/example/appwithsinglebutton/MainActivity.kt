package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var kotlinBtn: Button
    private lateinit var entryET: EditText
    private lateinit var showTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinBtn= findViewById(R.id.kotlinButton)
        entryET= findViewById(R.id.etEntry)
        showTV= findViewById(R.id.tvShow)

        kotlinBtn.setOnClickListener{
            if (entryET.text.isNotBlank())
                showTV.text= entryET.text
            else
                showTV.text= "Error"
            Toast.makeText(this,"Button One",Toast.LENGTH_SHORT).show()
        }
    }

    fun xmlClick(view: View) {
        Toast.makeText(this,"Button Two",Toast.LENGTH_SHORT).show()
    }
}