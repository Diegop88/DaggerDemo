package com.wizeline.dagger.di

import com.wizeline.dagger.view.main.GoodActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppBinder {
    @ContributesAndroidInjector
    abstract fun bindGoodActivity(): GoodActivity
}
