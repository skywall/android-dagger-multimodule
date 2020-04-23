package cz.skywal.mutimoduleexmaple.dummy_service

import android.app.Application
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import cz.skywal.mutimoduleexmaple.dummy_service.injection.DaggerDummyServiceComponent
import cz.skywall.multimoduleexample.core.injection.CoreComponentHolder

class DummyService : Service() {

    override fun onCreate() {
        super.onCreate()
        DaggerDummyServiceComponent
            .factory()
            .create(CoreComponentHolder.getInstance(applicationContext as Application))
            .inject(this)

        Log.d("DummyService", "I'm alive")
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
