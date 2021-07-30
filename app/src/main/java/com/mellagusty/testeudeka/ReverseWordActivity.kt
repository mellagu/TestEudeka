package com.mellagusty.testeudeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mellagusty.testeudeka.databinding.ActivityReverseWordBinding

class ReverseWordActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityReverseWordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReverseWordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btnHasil.setOnClickListener {
            val inputKata = binding.inputKata.text.toString().trim()
            var isEmptyFields = false
            var isReverse = false
            var encode = ""

            if (inputKata.isEmpty()){
                isEmptyFields = true
                binding.inputKata.error = "Kolom tidak boleh kosong"
            }
            if (!isEmptyFields){
                for (x in inputKata.length - 1 downTo 0) {
                    encode += inputKata[x]
                    isReverse = true
                }
            }
            if (isReverse){
                binding.tvHasil.text = encode
            } else{
                print("Input again")
            }
        }


        
    }


}