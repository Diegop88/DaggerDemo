package com.wizeline.daggerjava.ui.service;

import com.wizeline.daggerjava.data.Game;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    Game provideGame() {
        return new Game("The last of us 2");
    }
}
