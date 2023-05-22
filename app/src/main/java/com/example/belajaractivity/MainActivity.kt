package com.example.belajaractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajaractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener(){
            sendMessage()
        }
        setContentView(binding.root)
        Log.d("lifecycle", "Oncreate dimulai")
    }
    override fun onStart(){
        super.onStart()
        Log.d("lifecycle", "OnStart dimulai")
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "OnResume dimulai")
        binding.inputNama.setText("")
        binding.inputAlamat.setText("")
        binding.inputEmail.setText("")
        binding.inputHape.setText("")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "OnRestart dimulai")
    }
    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "OnStop dimulai")
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "OnPause dimulai")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "OnDestroy dimulai")
    }

    fun sendMessage(){
        //mendapatkan nilai yang diinputkan user, disimpan dalam variabel
        val nama2 = binding.inputNama.text.toString()
        val email2 = binding.inputEmail.text.toString()
        val alamat2 = binding.inputAlamat.text.toString()
        val hape2 = binding.inputHape.text.toString()
        //Mendapatkan intent dan disimpan dalam variabel
        val intent = Intent(this, MainActivity2::class.java)
        //Menyisipkan nilai dari var nama ke intent, dalam key "nama"
        intent.putExtra("name", nama2)
        intent.putExtra("email", email2)
        intent.putExtra("alamat", alamat2)
        intent.putExtra("hape", hape2)
        //Menjalankan Intent
        startActivity(intent)
    }

}