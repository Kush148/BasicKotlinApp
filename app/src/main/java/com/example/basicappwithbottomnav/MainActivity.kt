package com.example.basicappwithbottomnav

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val navController = Navigation.findNavController(this, R.id.navFragment)
        btmNav.setupWithNavController(navController)

        NavigationUI.setupWithNavController(btmNav,navController)
    }
}