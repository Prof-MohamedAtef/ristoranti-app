package mo.ed.ristoranti.composableui.auth

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun signUpScreen(navController: NavHostController){

}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun PreviewSignUpFunction() {
    Surface(modifier = Modifier.fillMaxSize()) {
//        LoginScreen()
    }
}