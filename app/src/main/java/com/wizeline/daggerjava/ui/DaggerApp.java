package com.wizeline.daggerjava.ui;

import android.app.Activity;
import android.app.Application;
import android.app.Service;

import com.wizeline.daggerjava.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasServiceInjector;

public class DaggerApp extends Application implements HasActivityInjector, HasServiceInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatcher;

    @Inject
    DispatchingAndroidInjector<Service> serviceDispatcher;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatcher;
    }

    @Override
    public AndroidInjector<Service> serviceInjector() {
        return serviceDispatcher;
    }
}
