package cz.skywall.multimoduleexample.home.base

import androidx.fragment.app.Fragment
import cz.skywall.multimoduleexample.App

open class BaseFragment : Fragment() {

    val component by lazy {
        (requireContext().applicationContext as? App)?.applicationComponent!!
    }
}
