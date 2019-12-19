package com.example.fragmenttabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val adapter=ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ChatFragment(),"CHAT")
        adapter.addFragment(StatusFragment(),"STATUS")
        adapter.addFragment(CallFragment(),"CALLS")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)



    }
}
