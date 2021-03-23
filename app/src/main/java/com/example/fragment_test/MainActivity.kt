package com.example.fragment_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(),Buttons{
    private val mainFragment = MyFirstFragment()
    private val addedFragment = AddedFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFragment.remover = this
        mainFragment.adder = this
        mainFragment.replacer = this
        addedFragment.remover = this
        addedFragment.replacer = this
        supportFragmentManager.beginTransaction().add(R.id.container,mainFragment).commit()

    }

    override fun add() {
        supportFragmentManager.beginTransaction().add(R.id.container,addedFragment)
        supportFragmentManager.beginTransaction().replace(R.id.container,addedFragment).commit()
    }

    override fun replace() {
        supportFragmentManager.beginTransaction().replace(R.id.container,addedFragment).commit()
    }

    override fun remove() {
        supportFragmentManager.beginTransaction().remove(addedFragment).commit()
        supportFragmentManager.beginTransaction().replace(R.id.container,mainFragment).commit()

    }

    override fun replace1() {
        supportFragmentManager.beginTransaction().replace(R.id.container,mainFragment).commit()
    }
}