package cz.skywall.multimoduleexample.home.injection

import android.app.Application
import cz.skywall.multimoduleexample.core.injection.CoreComponent
import cz.skywall.multimoduleexample.home.data.repository.DummyRepository2
import cz.skywall.multimoduleexample.home.ui.home.HomeFragmentComponent
import cz.skywall.multimoduleexample.home.ui.home.HomeFragmentModule
import dagger.Component
import dagger.Module
import dagger.Provides

@HomeScope
@Component(
    modules = [
        HomeModule::class
    ],
    dependencies = [
        CoreComponent::class
    ]
)
interface HomeComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): HomeComponent
    }

    fun plus(module: HomeFragmentModule): HomeFragmentComponent
}

@Module
class HomeModule {
    @Provides
    fun dummyRepository2(application: Application): DummyRepository2 {
        return DummyRepository2()
    }
}
