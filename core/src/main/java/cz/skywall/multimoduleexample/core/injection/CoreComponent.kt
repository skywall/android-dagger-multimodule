package cz.skywall.multimoduleexample.core.injection

import android.app.Application
import android.content.SharedPreferences
import cz.skywall.multimoduleexample.database.injection.DatabaseContract
import cz.skywall.multimoduleexample.database.injection.DatabaseModule
import cz.skywall.multimoduleexample.network.injection.NetworkContract
import cz.skywall.multimoduleexample.network.injection.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class,
        DatabaseModule::class,
        NetworkModule::class
    ]
)
interface CoreComponent : DatabaseContract, NetworkContract {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): CoreComponent
    }

    fun application(): Application

    fun sharedPreferences(): SharedPreferences
}
