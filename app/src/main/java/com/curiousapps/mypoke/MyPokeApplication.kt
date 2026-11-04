package com.curiousapps.mypoke

import android.app.Application
import timber.log.Timber

class MyPokeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}