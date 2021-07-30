package com.mellagusty.testeudeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.mellagusty.testeudeka.databinding.ActivityHelloWorldBinding

class HelloWorldActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHelloWorldBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloWorldBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHasil.setOnClickListener {
            val inputAngka = binding.inputAngka.text.toString().trim()
            var isEmptyFields = false

            if (inputAngka.isEmpty()){
                isEmptyFields = true
                binding.inputAngka.error = "Kolom tidak boleh kosong"
            }
            if (!isEmptyFields){
                val result1 = inputAngka.toInt()%3 == 0
                val result2 = inputAngka.toInt()%5 == 0
                val result3 = inputAngka.toInt()%3 == 0 && inputAngka.toInt()%5 == 0

                if (result1){
                    binding.tvHasil.text = "Hello"
                }
                if (result2){
                    binding.tvHasil.text = "World"
                }
                if (result3){
                    binding.tvHasil.text = "Hello World"
                }

            }


        }


    }

}