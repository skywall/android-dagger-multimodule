package cz.skywall.multimoduleexample.home.ui.home

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cz.skywall.multimoduleexample.home.base.BaseFragment
import javax.inject.Inject

class HomeFragment : BaseFragment() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        DaggerHomeFragmentComponent.factory().create(HomeFragmentModule(), component).inject(this)

        return TextView(requireActivity()).apply {
            text = "Home Fragment"
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sharedPreferences.all
    }
}
