package cz.skywall.multimoduleexample.database.injection

import cz.skywall.multimoduleexample.database.Database

interface DatabaseContract {

    fun database(): Database
}
