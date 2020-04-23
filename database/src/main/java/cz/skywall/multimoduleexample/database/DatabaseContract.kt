package cz.skywall.multimoduleexample.database

interface DatabaseContract {

    fun userDao(): UserDao
}
