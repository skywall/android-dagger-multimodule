package cz.skywall.multimoduleexample.database

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun userDao(application: Application) : UserDao {
        return UserDao(application)
    }
}
