package com.example.androidlab

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlab.databinding.ActivityViewBindingBinding


class ViewBinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체 획득
        val binding = ActivityViewBindingBinding.inflate(layoutInflater)

        // 액티비티 화면 출력
        setContentView(binding.root)

        // 뷰 객체 사용
        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }
        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }
    }
}