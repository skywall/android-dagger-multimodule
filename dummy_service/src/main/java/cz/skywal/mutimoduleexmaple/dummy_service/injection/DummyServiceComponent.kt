package cz.skywal.mutimoduleexmaple.dummy_service.injection

import cz.skywal.mutimoduleexmaple.dummy_service.DummyService
import cz.skywall.multimoduleexample.core.injection.CoreComponent
import dagger.Component

@DummyServiceScope
@Component(
    dependencies = [
        CoreComponent::class
    ]
)
interface DummyServiceComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): DummyServiceComponent
    }

    fun inject(service: DummyService)
}
