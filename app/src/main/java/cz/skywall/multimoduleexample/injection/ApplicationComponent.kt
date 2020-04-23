package cz.skywall.multimoduleexample.injection

import android.app.Application
import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.core.injection.CoreComponent
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    dependencies = [
        CoreComponent::class
    ]
)
internal interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application, coreComponent: CoreComponent): ApplicationComponent
    }

    fun inject(app: App)
}
