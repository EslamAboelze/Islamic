package com.example.islamic.uitils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islamic.MainActivity
import com.example.islamic.R
import com.example.islamic.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hellal.setOnClickListener {
            binding.hellal.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.start()
            val intent = Intent(this, MainActivity::class.java)
            val t: Thread = object : Thread() {
                override fun run() {
                    super.run()
                    try {
                        sleep(1000)
                        startActivity(intent)
                        finish()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            t.start()


        }
    }
}
