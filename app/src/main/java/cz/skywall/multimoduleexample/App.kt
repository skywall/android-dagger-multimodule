package cz.skywall.multimoduleexample

import android.app.Application
import android.content.SharedPreferences
import cz.skywall.multimoduleexample.core.injection.CoreComponentHolder
import cz.skywall.multimoduleexample.core.mapper.toDB
import cz.skywall.multimoduleexample.database.UserDao
import cz.skywall.multimoduleexample.injection.DaggerApplicationComponent
import cz.skywall.multimoduleexample.network.ApiService
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class App : Application() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences
    @Inject
    lateinit var apiService: ApiService
    @Inject
    lateinit var userDao: UserDao

    private val applicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this, CoreComponentHolder.getInstance(this))
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)

        sharedPreferences.all
        runBlocking {
            val user = apiService.getUser()
            userDao.insertUser(user.toDB())
        }
    }
}
