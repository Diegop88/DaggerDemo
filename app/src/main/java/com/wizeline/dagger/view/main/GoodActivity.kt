package com.wizeline.dagger.view.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.wizeline.dagger.R
import com.wizeline.dagger.data.Conn
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class GoodActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatch: DispatchingAndroidInjector<Fragment>

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

    override fun supportFragmentInjector()= fragmentDispatch
}
