package com.mellagusty.testeudeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.mellagusty.testeudeka.databinding.ActivityEmailFormatBinding

class EmailFormatActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEmailFormatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailFormatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inputEmail.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.text.toString()).matches())
                    binding.btnSubmit.isEnabled = true
                else{
                    binding.btnSubmit.isEnabled = false
                    binding.inputEmail.setError("Email not valid")
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
    }
}