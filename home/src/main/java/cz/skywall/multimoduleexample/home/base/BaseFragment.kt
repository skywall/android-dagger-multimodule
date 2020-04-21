package cz.skywall.multimoduleexample.home.base

import android.content.Context
import androidx.fragment.app.Fragment
import cz.skywall.multimoduleexample.App
import cz.skywall.multimoduleexample.home.injection.DaggerHomeComponent
import cz.skywall.multimoduleexample.home.injection.HomeComponent

abstract class BaseFragment : Fragment() {

    val homeComponent: HomeComponent by lazy {
        DaggerHomeComponent
            .factory()
            .create((requireContext().applicationContext as App).applicationComponent)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        inject()
    }

    abstract fun inject()
}
