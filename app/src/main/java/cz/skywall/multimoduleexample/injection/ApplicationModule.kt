package cz.skywall.multimoduleexample.injection

import android.app.Application
import android.content.res.Resources
import dagger.Module

@Module
class ApplicationModule{

    fun resources(application: Application): Resources {
        return application.resources
    }
}
