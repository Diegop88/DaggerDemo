package com.wizeline.dagger.di

import com.wizeline.dagger.data.Conn
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideConn() = Conn("http://dev.com")


}
