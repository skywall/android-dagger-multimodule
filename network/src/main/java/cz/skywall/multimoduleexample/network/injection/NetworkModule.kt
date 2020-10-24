package cz.skywall.multimoduleexample.network.injection

import cz.skywall.multimoduleexample.network.ApiService
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun apiService() : ApiService {
        return ApiService()
    }
}
