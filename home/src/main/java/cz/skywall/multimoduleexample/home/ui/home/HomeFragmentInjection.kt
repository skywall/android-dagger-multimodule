package cz.skywall.multimoduleexample.home.ui.home

import dagger.Module
import dagger.Subcomponent
import dagger.Provides

@Subcomponent(
    modules = [HomeFragmentModule::class]
)
interface HomeFragmentComponent {

    fun inject(homeFragment: HomeFragment)
}

@Module
class HomeFragmentModule(private val homeFragment: HomeFragment) {

    @Provides
    fun homeView(): HomeView = homeFragment
}
