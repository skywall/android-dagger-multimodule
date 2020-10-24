package cz.skywall.multimoduleexample.database.injection

import android.app.Application
import cz.skywall.multimoduleexample.database.Database
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun database(application: Application) : Database {
        return Database(application)
    }
}
