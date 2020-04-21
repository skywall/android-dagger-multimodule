package cz.skywall.multimoduleexample.injection

import android.app.Application
import android.content.SharedPreferences
import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.core.injection.CoreModule
import cz.skywall.multimoduleexample.database.DatabaseModule
import cz.skywall.multimoduleexample.database.UserDao
import cz.skywall.multimoduleexample.network.ApiService
import cz.skywall.multimoduleexample.network.NetworkModule
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        CoreModule::class,
        DatabaseModule::class,
        NetworkModule::class
    ]
)
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application) : ApplicationComponent
    }

    fun inject(app: App)

    fun userDao(): UserDao

    fun apiService(): ApiService

    fun sharedPreference(): SharedPreferences

    fun application(): Application
}
