package com.example.islamic.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.example.islamic.R
import com.example.islamic.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var binding: ActivityMainBinding
    lateinit var fragment: Fragment
    lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        drawerLayout = binding.drawerlayout
        setSupportActionBar(binding.toolbars)


        binding.navigationview.setNavigationItemSelectedListener(this)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navigationview, navController)

    }

   override fun onNavigationItemSelected(item: MenuItem): Boolean {
      /*  when (item.itemId) {
            R.id.prayerTimes -> {
                drawerLayout.closeDrawer(GravityCompat.START)
                navController.navigate(R.id.action_homeFragment_to_prayerTimes)
            }
            R.id.directionOfPrayer -> {
                drawerLayout.closeDrawer(GravityCompat.START)
                navController.navigate(R.id.action_homeFragment_to_directionOfPrayer2)
            }
            R.id.share -> {
                Toast.makeText(this,"share icon",Toast.LENGTH_LONG).show()
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.rate ->{
                drawerLayout.closeDrawer(GravityCompat.START)
             startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/")))
            }

        }*/
        return NavigationUI.onNavDestinationSelected(item, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawerLayout)
    }


}







