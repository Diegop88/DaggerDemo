package com.wizeline.daggerjava.di;

import android.app.Application;

import com.wizeline.daggerjava.ui.DaggerApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        AppBinder.class
})
public interface AppComponent {
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(DaggerApp app);
}
