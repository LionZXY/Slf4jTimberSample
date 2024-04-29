package uk.kulikov.slf4jtimbersample

import android.app.Application
import timber.log.Timber

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(TimberDebugTree())
    }
}