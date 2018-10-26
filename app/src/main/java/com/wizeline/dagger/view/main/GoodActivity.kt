package com.wizeline.dagger.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wizeline.dagger.R
import com.wizeline.dagger.data.Conn
import dagger.android.AndroidInjection
import javax.inject.Inject

class GoodActivity : AppCompatActivity() {

    @Inject
    lateinit var conn: Conn

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, conn.URL, Toast.LENGTH_LONG).show()
    }
}
