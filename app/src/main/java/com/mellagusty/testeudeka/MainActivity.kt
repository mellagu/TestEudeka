package com.mellagusty.testeudeka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mellagusty.testeudeka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHelloworld.setOnClickListener {
            val intent = Intent(this,HelloWorldActivity::class.java)
            startActivity(intent)
        }
        binding.btnReverseWord.setOnClickListener {
            val intent = Intent(this, ReverseWordActivity::class.java)
            startActivity(intent)
        }
        binding.btnPalindrome.setOnClickListener {
            val intent = Intent(this, PalindromeActivity::class.java)
            startActivity(intent)
        }
        binding.btnEmail.setOnClickListener {
            val intent = Intent(this, EmailFormatActivity::class.java)
            startActivity(intent)
        }

    }
}