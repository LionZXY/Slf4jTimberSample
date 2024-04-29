package uk.kulikov.slf4jtimbersample

import android.util.Log
import timber.log.Timber

class TimberDebugTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        Log.d("TimberDebugTree", "From timber ($tag): $message")
    }
}