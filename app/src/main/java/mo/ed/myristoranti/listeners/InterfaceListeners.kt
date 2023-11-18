package mo.ed.ristoranti.listeners

class InterfaceListeners {
    interface LoadingInterface {
        fun showLoading()
        fun hideLoading()
    }

    interface LoginUiInterface{
        fun onBackPressed()
        fun onForgotPassword()
        fun onSignUp()
        fun onLoginButtonClick(username: String, password:String)
    }

    interface WalkthroughInterface{
        fun onWalkthroughButtonClick()
    }
}