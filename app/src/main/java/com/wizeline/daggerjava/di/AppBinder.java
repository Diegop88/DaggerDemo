package com.wizeline.daggerjava.di;

import com.wizeline.daggerjava.ui.main.DemoFragment;
import com.wizeline.daggerjava.ui.main.MainActivity;
import com.wizeline.daggerjava.ui.service.DemoService;
import com.wizeline.daggerjava.ui.service.ServiceModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class AppBinder {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector
    abstract DemoFragment bindDemoFragment();

    @ContributesAndroidInjector(modules = ServiceModule.class)
    abstract DemoService bindDemoService();
}
