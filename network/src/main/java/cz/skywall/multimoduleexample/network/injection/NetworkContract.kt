package cz.skywall.multimoduleexample.network.injection

import cz.skywall.multimoduleexample.network.ApiService

interface NetworkContract {
    fun apiService(): ApiService
}
