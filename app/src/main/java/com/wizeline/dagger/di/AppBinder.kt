package com.wizeline.dagger.di

import com.wizeline.dagger.view.main.FragmentBinder
import com.wizeline.dagger.view.main.GoodActivity
import com.wizeline.dagger.view.main.GoodActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppBinder {
    @ContributesAndroidInjector(modules = [GoodActivityModule::class, FragmentBinder::class])
    abstract fun whatever(): GoodActivity

    @ContributesAndroidInjector
    :Fragment
}
