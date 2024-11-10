package com.example.androidlab

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab.databinding.ActivityViewEventTestBinding

class ViewEventTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityViewEventTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener {
                compoundButton, b ->
            Log.d("seo", "체크박스 클릭")
        }
    }
}