package com.rhytham.demoinvoidr1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rhytham.upload_document.UploadActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.button)

        btn.setOnClickListener {
            val intent=Intent(this,UploadActivity::class.java)
            startActivity(intent)
        }
    }
}