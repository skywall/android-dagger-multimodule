package cz.skywall.multimoduleexample.core.injection

import android.app.Application
import android.content.SharedPreferences
import cz.skywall.multimoduleexample.database.DatabaseModule
import cz.skywall.multimoduleexample.database.UserDao
import cz.skywall.multimoduleexample.network.ApiService
import cz.skywall.multimoduleexample.network.NetworkModule
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [
        CoreModule::class,
        DatabaseModule::class,
        NetworkModule::class
    ]
)
interface CoreSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): CoreSubcomponent
    }

    fun userDao(): UserDao

    fun apiService(): ApiService

    fun sharedPreference(): SharedPreferences
}
