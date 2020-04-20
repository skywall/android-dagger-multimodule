package cz.skywall.multimoduleexample.core.mapper

import cz.skywall.multimoduleexample.database.UserDB
import cz.skywall.multimoduleexample.network.UserAPI

fun UserAPI.toDB() : UserDB = UserDB("$firstName $lastName")
