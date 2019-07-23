package com.wizeline.dagger.view.main

import dagger.Module
import dagger.Provides

@Module
class GoodActivityModule {

    @Provides
    fun getNumber() = 5
}