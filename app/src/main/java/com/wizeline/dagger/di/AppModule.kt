package com.wizeline.dagger.di

import android.app.Application
import android.content.Context
import com.wizeline.dagger.BuildConfig
import com.wizeline.dagger.data.Conn
import dagger.Module
import dagger.Provides
import javax.inject.Scope
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideConn() = Conn("")

    @Provides
    fun provideContext(application: Application) = RoomDatabase.build(application, "", 1)

}
