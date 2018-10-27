package com.wizeline.daggerjava.di;

import com.wizeline.daggerjava.BuildConfig;
import com.wizeline.daggerjava.data.Conn;
import com.wizeline.daggerjava.data.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    Conn provideConn() {
        return new Conn(BuildConfig.BASE_URL);
    }

    @Provides
    User provideUser() {
        return new User("Yisus");
    }
}
