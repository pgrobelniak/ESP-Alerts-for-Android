package pl.vortexinfinitum.espalerts.app

import android.content.Context
import android.content.SharedPreferences
import android.support.multidex.MultiDexApplication
import timber.log.Timber
import pl.vortexinfinitum.espalerts.BuildConfig

/**
 *
 */
class MainApplication : MultiDexApplication() {

    companion object {
        val PREFS_KEY_ALLOWED_PACKAGES = "PREFS_KEY_ALLOWED_PACKAGES"
        lateinit var sharedPrefs: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()

        sharedPrefs = getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }


}