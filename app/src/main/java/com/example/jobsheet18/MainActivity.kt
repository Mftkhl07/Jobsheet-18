package com.example.jobsheet18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawer: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.nav_view)
        drawer = findViewById(R.id.drawer_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.title = "JOBSHEET 18"

        toggle = ActionBarDrawerToggle(
            this@MainActivity, drawer,
            0, 0
        )

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        return toggle.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.To-> {
                val fragmentTpfl = supportFragmentManager.beginTransaction()
                fragmentTpfl.replace(R.id.content, To())
                fragmentTpfl.commit()
                drawer.close()
            }
            R.id.Pplg -> {
                val fragmentTo = supportFragmentManager.beginTransaction()
                fragmentTo.replace(R.id.content, Pplg())
                fragmentTo.commit()
                drawer.close()
            }
            R.id.Tpfl -> {
                val fragmentPplg = supportFragmentManager.beginTransaction()
                fragmentPplg.replace(R.id.content, Tpfl())
                fragmentPplg.commit()
                drawer.close()
            }
            R.id.Busana -> {
                val fragmentKuliner = supportFragmentManager.beginTransaction()
                fragmentKuliner.replace(R.id.content, Busana())
                fragmentKuliner.commit()
                drawer.close()
            }
            R.id.Kuliner -> {
                val fragmentBusana = supportFragmentManager.beginTransaction()
                fragmentBusana.replace(R.id.content, Kuliner())
                fragmentBusana.commit()
                drawer.close()
            }
        }
        return true
    }
}




