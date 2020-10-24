package cz.skywall.multimoduleexample.network

import kotlinx.coroutines.delay

class ApiService {

    suspend fun getUser(): UserAPI {
        delay(10)
        return UserAPI("Jan", "Novák")
    }
}
