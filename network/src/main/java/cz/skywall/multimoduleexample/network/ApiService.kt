package cz.skywall.multimoduleexample.network

class ApiService {

    suspend fun getUser(): UserAPI {
        return UserAPI("Jan", "Novák")
    }
}
