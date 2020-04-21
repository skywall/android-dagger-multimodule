package cz.skywall.multimoduleexample.home.injection

import android.app.Application
import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.home.data.repository.DummyRepository2
import cz.skywall.multimoduleexample.home.ui.home.HomeFragmentComponent
import cz.skywall.multimoduleexample.home.ui.home.HomeFragmentModule
import cz.skywall.multimoduleexample.injection.ApplicationComponent
import dagger.Component
import dagger.Module
import dagger.Provides

@HomeScope
@Component(
    modules = [
        HomeModule::class
    ],
    dependencies = [
        ApplicationComponent::class
    ]
)
interface HomeComponent {

    @Component.Factory
    interface Factory {
        fun create(applicationComponent: ApplicationComponent) : HomeComponent
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

object HomeComponentHolder {
    val homeComponent: HomeComponent by lazy {
        DaggerHomeComponent.factory().create(App.INSTANCE.applicationComponent)
    }
}

