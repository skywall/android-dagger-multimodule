package cz.skywall.multimoduleexample.home.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cz.skywal.mutimoduleexmaple.dummy_service.DummyService
import cz.skywall.multimoduleexample.home.R
import cz.skywall.multimoduleexample.common.R as CR
import cz.skywall.multimoduleexample.R as AR
import cz.skywall.multimoduleexample.home.base.BaseFragment
import cz.skywall.multimoduleexample.home.data.repository.DummyRepository
import cz.skywall.multimoduleexample.home.data.repository.HomeDummyRepository
import cz.skywall.multimoduleexample.network.ApiService
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomeView {

    @Inject lateinit var homeAdapter: HomeAdapter
    @Inject lateinit var sharedPreferences: SharedPreferences
    @Inject lateinit var apiService: ApiService
    @Inject lateinit var dummyRepository: DummyRepository
    @Inject lateinit var homeDummyRepository: HomeDummyRepository

    override fun inject() {
        homeComponent.plus(HomeFragmentModule(this)).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        requireActivity().startService(Intent(requireActivity(), DummyService::class.java))

        // Check if everything injected properly by accessing instances.
        sharedPreferences.all
        dummyRepository.toString()
        homeDummyRepository.toString()
        homeAdapter.toString()
        apiService.toString()

        combined_text.text =
            """Combined: 
                ${resources.getString(CR.string.string_from_common)}
                ${resources.getString(AR.string.string_from_app)}
                ${resources.getString(R.string.string_from_home)}"""
    }
}
