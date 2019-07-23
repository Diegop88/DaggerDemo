package com.wizeline.dagger.view

import android.app.Activity
import android.app.Application
import android.app.Service
import com.wizeline.dagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import javax.inject.Inject

class DaggerApp : Application(), HasActivityInjector, HasServiceInjector {
    @Inject
    lateinit var activityDispatch: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var serviceDispatch: DispatchingAndroidInjector<Service>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatch

    override fun serviceInjector(): AndroidInjector<Service> = serviceDispatch
}
