package com.wizeline.daggerjava.ui.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.wizeline.daggerjava.data.Game;
import com.wizeline.daggerjava.data.User;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class DemoService extends Service {

    @Inject
    Game game;

    @Override
    public void onCreate() {
        AndroidInjection.inject(this);
        super.onCreate();

        Toast.makeText(this, game.getGameName(), Toast.LENGTH_LONG).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
