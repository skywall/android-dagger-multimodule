package cz.skywall.multimoduleexample.core.injection

import android.app.Application
import cz.skywall.multimoduleexample.common.SingletonHolder

object CoreComponentHolder {

    private object Component : SingletonHolder<CoreComponent, Application>({ application ->
        DaggerCoreComponent.factory().create(application)
    })

    fun getInstance(application: Application): CoreComponent {
        return Component.getInstance(application)
    }
}
