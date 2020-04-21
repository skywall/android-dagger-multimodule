package cz.skywall.multimoduleexample.database

import android.app.Application

class UserDao(application: Application) {

    var userDB : UserDB? = null

    suspend fun getUser(): UserDB {
        return userDB ?: UserDB("full name")
    }

    suspend fun insertUser(userDB: UserDB) {
        this.userDB = userDB
    }
}
