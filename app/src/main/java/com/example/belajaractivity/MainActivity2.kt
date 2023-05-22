package com.example.belajaractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val name = intent.getStringExtra("name")
        binding.namauser.text = name.toString()
        //setContentView(binding.root)

        val email = intent.getStringExtra("email")
        binding.emailuser.text = email.toString()
        //setContentView(binding.root)

        val alamat = intent.getStringExtra("alamat")
        binding.alamatuser.text = alamat.toString()
        //setContentView(binding.root)

        val hape  = intent.getStringExtra("hape")
        binding.hapeuser.text = hape.toString()
        setContentView(binding.root)
    }
}