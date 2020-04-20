package cz.skywall.multimoduleexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (main_navigation_fragment as? NavHostFragment)?.navController?.apply {
            val navGraph = navInflater.inflate(R.navigation.main_nav_graph).apply {
                startDestination = R.id.home_navigation_graph
            }

            graph = navGraph
        }
    }
}
