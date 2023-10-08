package com.example.expresscart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private val notifFragment = notificationFragment()
private val homess = HomesFragment()
private val settingFragment = settingsFragment()

class bottom_navigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.navigationView)
        replaceFragment(notifFragment)

        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.notif->replaceFragment(notifFragment)
                R.id.settings->replaceFragment(settingFragment)
                R.id.homes->replaceFragment(homess)

            }
            true
        }
    }
    private fun replaceFragment(fragment:Fragment){
        if(fragment!=null){
            val transaction =supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout,fragment)
            transaction.commit()
        }
    }
}