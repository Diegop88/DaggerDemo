package com.wizeline.dagger.view.main

import android.support.v4.app.Fragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBinder {
    @ContributesAndroidInjector
    abstract fun bindFragment(): Fragment
}