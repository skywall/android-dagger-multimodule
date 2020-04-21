package cz.skywall.multimoduleexample.injection

import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.core.injection.CoreSubcomponent
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        ApplicationModule::class
    ],
    dependencies = [
        CoreSubcomponent::class
    ]
)
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App, coreSubcomponent: CoreSubcomponent): ApplicationComponent
    }

    fun inject(app: App)
}
