package cz.skywall.multimoduleexample.core.injection

import dagger.Component

@Component
interface ModulesComponent {

    @Component.Factory
    interface Factory {
        fun create(): ModulesComponent
    }

    fun coreSubcomponentFactory(): CoreSubcomponent.Factory

}
