package com.example.androidlab

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KeyEventTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_key_event_test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("seo", "onKeyDown")
        when (keyCode) {
            KeyEvent.KEYCODE_BACK -> Log.d("seo", "back button을 눌렀습니다.")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("seo", "Volume up 키를 눌렀습니다.")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("seo", "Volume down 버튼을 눌렀습니다.")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("seo", "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }
}