package com.nathan.bblister.ui.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.nathan.bblister.R
import kotlinx.android.synthetic.main.activity_b_list.*

class BListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_list)
        setSupportActionBar(toolbar)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navFragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)

        toolbar.setNavigationOnClickListener(View.OnClickListener {
            // do whatever you want
            navController.popBackStack()
        })
    }
}