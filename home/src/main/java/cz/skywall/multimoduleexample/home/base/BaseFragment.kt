package cz.skywall.multimoduleexample.home.base

import android.content.Context
import androidx.fragment.app.Fragment
import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.common.SingletonHolder
import cz.skywall.multimoduleexample.core.injection.CoreComponentHolder
import cz.skywall.multimoduleexample.home.injection.DaggerHomeComponent
import cz.skywall.multimoduleexample.home.injection.HomeComponent

abstract class BaseFragment : Fragment() {

    private object ModuleComponent : SingletonHolder<HomeComponent, Context>({ context ->
        DaggerHomeComponent
            .factory()
            .create(CoreComponentHolder.getInstance(context.applicationContext as App))
    })

    val homeComponent: HomeComponent
        get() = ModuleComponent.getInstance(requireContext())

    override fun onAttach(context: Context) {
        super.onAttach(context)
        inject()
    }

    abstract fun inject()
}
