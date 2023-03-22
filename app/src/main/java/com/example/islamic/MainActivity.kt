package com.example.islamic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.ActionBar
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.islamic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
    }
  /*  override fun onResume() {
        super.onResume()
        val navController=findNavController(R.id.container)
        binding.navigation.setupWithNavController(navController)

    }
*/
}