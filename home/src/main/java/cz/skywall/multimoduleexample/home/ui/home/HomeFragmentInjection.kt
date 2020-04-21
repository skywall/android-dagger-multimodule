package cz.skywall.multimoduleexample.home.ui.home

import cz.skywall.multimoduleexample.core.injection.CoreSubcomponent
import dagger.Component
import dagger.Module

@Component(modules = [HomeFragmentModule::class], dependencies = [CoreSubcomponent::class])
interface HomeFragmentComponent {

    @Component.Factory
    interface Factory {
        fun create(module: HomeFragmentModule, coreSubcomponent: CoreSubcomponent): HomeFragmentComponent
    }

    fun inject(homeFragment: HomeFragment)
}

@Module
class HomeFragmentModule




