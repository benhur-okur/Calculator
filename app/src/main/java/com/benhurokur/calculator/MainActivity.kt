package com.benhurokur.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Video
import android.view.View
import com.benhurokur.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        result = "0.0"




    }

    fun plus(view : View) {
        var no : Double? = binding.enterNo.text.toString().toDoubleOrNull()
        var x : Double
        if (no != null) {
            x = result.toDouble()
            x += no.toDouble()
            result = x.toString()
            binding.textView.text = x.toString()
            binding.enterNo.hint = "Enter A Number"
        } else {
            binding.textView.text = "Enter A Number!"
        }
    }

    fun minus (view : View) {
        var no : Double? = binding.enterNo.text.toString().toDoubleOrNull()
        var x : Double
        if (no != null) {
            x = result.toDouble()
            x -= no.toDouble()
            result = x.toString()
            binding.textView.text = x.toString()
            binding.enterNo.hint = "Enter A Number"
        } else {
            binding.textView.text = "Enter A Number!"
        }
    }

    fun multiplication (view: View) {
        var no : Double? = binding.enterNo.text.toString().toDoubleOrNull()
        var x : Double
        if (no != null) {
            x = result.toDouble()
            x *= no.toDouble()
            result = x.toString()
            binding.textView.text = x.toString()
            binding.enterNo.hint = "Enter A Number"
        } else {
            binding.textView.text = "Enter A Number!"
        }
    }

    fun divide (view : View) {
        var no : Double? = binding.enterNo.text.toString().toDoubleOrNull()
        var x : Double
        if (no != null ) {
            if (no.toInt() == 0) {
                binding.textView.text = "Enter A Number!, You cannot divide with 0!"
            } else {
                x = result.toDouble()
                x /= no.toDouble()
                result = x.toString()
                binding.textView.text = x.toString()
                binding.enterNo.hint = "Enter A Number"
            }
        } else {
            binding.textView.text = "Enter A Number!"
        }
    }
}