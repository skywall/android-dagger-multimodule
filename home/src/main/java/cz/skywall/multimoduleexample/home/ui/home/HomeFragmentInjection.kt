package cz.skywall.multimoduleexample.home.ui.home

import cz.skywall.multimoduleexample.injection.ApplicationComponent
import dagger.Component
import dagger.Module

@Component(modules = [HomeFragmentModule::class], dependencies = [ApplicationComponent::class])
interface HomeFragmentComponent {

    @Component.Factory
    interface Factory {
        fun create(module: HomeFragmentModule, component: ApplicationComponent): HomeFragmentComponent
    }

    fun inject(homeFragment: HomeFragment)
}

@Module
class HomeFragmentModule




