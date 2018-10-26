package com.wizeline.dagger.di

import android.app.Application
import com.wizeline.dagger.view.DaggerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppBinder::class,
        AppModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: DaggerApp)
}