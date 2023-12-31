package mo.ed.ristoranti.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import mo.ed.myristoranti.viewmodels.FoodItemsViewModel
import mo.ed.myristoranti.views.activities.HomeActivity
import mo.ed.myristoranti.views.activities.MainActivity
import mo.ed.myristoranti.views.fragments.BaseFragment
import mo.ed.ristoranti.composableui.auth.login.loginScreen
import mo.ed.ristoranti.listeners.InterfaceListeners

class LoginFragment : BaseFragment(), InterfaceListeners.LoginUiInterface {

    private val foodItemsViewModel: FoodItemsViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                loginScreen(loginScreenInterface = this@LoginFragment)
            }
        }
    }

    override fun onBackPressed() {
        val action = LoginFragmentDirections.actionLoginFragmentToWalkthroughFragment()
        findNavController().navigate(action)
    }

    override fun onForgotPassword() {
        TODO("Not yet implemented")
    }

    override fun onSignUp() {
        TODO("Not yet implemented")
    }

    override fun onLoginButtonClick(username: String, password: String) {
//        activity?.let {
//            val intent = Intent(it, HomeActivity::class.java)
//            it.startActivity(intent)
//        }

        // apply login calling api

        foodItemsViewModel.userLogin("01287864053", "12345678", "galaxy A10")


    }
}