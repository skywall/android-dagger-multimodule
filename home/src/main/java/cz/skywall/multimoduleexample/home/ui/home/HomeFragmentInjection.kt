package cz.skywall.multimoduleexample.home.ui.home

import dagger.Module
import dagger.Subcomponent

@Subcomponent(
    modules = [HomeFragmentModule::class]
)
interface HomeFragmentComponent {

    fun inject(homeFragment: HomeFragment)
}

@Module
class HomeFragmentModule
