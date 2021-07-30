package com.mellagusty.testeudeka

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mellagusty.testeudeka.databinding.ActivityPalindromeBinding

class PalindromeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPalindromeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPalindromeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHasil.setOnClickListener {

            val wordsInput = binding.inputKata.text.toString().toCharArray()
            val intLenght = wordsInput.count()
            var isPalindrome = false
            var isEmptyFields = false
            var encode = ""

            if (wordsInput.isEmpty()) {
                isEmptyFields = true
                binding.inputKata.error = "Kolom tidak boleh kosong"
            }
            if (!isEmptyFields) {
                for (i in intLenght - 1 downTo 0) {
                    if (wordsInput[i] != wordsInput[intLenght - 1 - i]) {
                        isPalindrome = true
                    }
//                    Log.d(TAG,"ini hasilnya $encode")
                }
                if (isPalindrome){
                    binding.tvHasil.text = "false"
                }
                if (!isPalindrome){
                    binding.tvHasil.text = "true"
                }
            }


        }
    }
}