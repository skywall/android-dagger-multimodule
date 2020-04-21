package cz.skywall.multimoduleexample.network

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun apiService() : ApiService {
        return ApiService()
    }
}
