package cz.skywall.multimoduleexample.database

import android.app.Application
import kotlinx.coroutines.delay

class Database(application: Application) {

    init {
        // application/context is probably needed when DB constructed
        application.toString()
    }

    var userDB : UserDB? = null

    suspend fun getUser(): UserDB {
        delay(10)
        return userDB!!
    }

    suspend fun insertUser(userDB: UserDB) {
        delay(10)
        this.userDB = userDB
    }
}
