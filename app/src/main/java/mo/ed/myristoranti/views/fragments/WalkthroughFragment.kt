package mo.ed.ristoranti.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.navigation.fragment.findNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import mo.ed.myristoranti.views.fragments.BaseFragment
import mo.ed.ristoranti.composableui.walkthrough.onBoarding
import mo.ed.ristoranti.listeners.InterfaceListeners

class WalkthroughFragment : BaseFragment(), InterfaceListeners.WalkthroughInterface {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                onBoarding(walkthroughScreenInterface = this@WalkthroughFragment)
            }
        }
    }

    override fun onWalkthroughButtonClick() {
        val action = WalkthroughFragmentDirections.actionWalkthoughFragmentToLoginFragment()
        findNavController().navigate(action)
    }
}