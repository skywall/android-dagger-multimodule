package cz.skywall.multimoduleexample.database

class UserDao {

    var userDB : UserDB? = null

    suspend fun getUser(): UserDB {
        return userDB ?: UserDB("full name")
    }

    suspend fun insertUser(userDB: UserDB) {
        this.userDB = userDB
    }
}
