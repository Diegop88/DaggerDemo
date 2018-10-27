package com.wizeline.daggerjava.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.wizeline.daggerjava.R;
import com.wizeline.daggerjava.data.Conn;
import com.wizeline.daggerjava.data.Game;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    Conn conn;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new DemoFragment())
                .commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, conn.URL, Toast.LENGTH_LONG).show();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatcher;
    }
}
