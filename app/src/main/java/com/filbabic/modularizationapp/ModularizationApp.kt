package com.filbabic.modularizationapp

import android.app.Application
import com.filbabic.modularizationapp.data.login.dataLoginModule
import com.filbabic.modularizationapp.domain.login.domainLoginModule
import com.filbabic.modularizationapp.features.login.featureLoginModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ModularizationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ModularizationApp)
            modules(domainLoginModule, dataLoginModule, featureLoginModule)
        }
    }
}
