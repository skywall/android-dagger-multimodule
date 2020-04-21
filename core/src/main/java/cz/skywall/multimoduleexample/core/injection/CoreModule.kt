package cz.skywall.multimoduleexample.core.injection

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class CoreModule {

    @Provides
    fun sharedPreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences("sp", Context.MODE_PRIVATE)
    }
}
