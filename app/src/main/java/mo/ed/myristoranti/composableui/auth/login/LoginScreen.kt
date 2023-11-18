package mo.ed.ristoranti.composableui.auth.login

import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.launch
import mo.ed.myristoranti.R
import mo.ed.ristoranti.base.AppButton
import mo.ed.ristoranti.base.AppText
import mo.ed.ristoranti.base.AppTextField
import mo.ed.ristoranti.base.ButtonStyle
import mo.ed.ristoranti.base.FontStyle
import mo.ed.ristoranti.base.TextFieldStyle
import mo.ed.ristoranti.base.getTextStyle
import mo.ed.ristoranti.composableui.auth.facebookButton
import mo.ed.ristoranti.composableui.auth.googleButton
import mo.ed.ristoranti.listeners.InterfaceListeners

@Composable
fun loginScreen(
    loginScreenInterface: InterfaceListeners.LoginUiInterface? = null,
    _userName: String? = "",
    _name: String? = "",
    _password: String? = "",
    _isError: Boolean? = false,
    _errorMessage: String = "",
    isArabic: Boolean = false,
    fullName: String = "",
) {
    val delayTime: Long = 1000
    var userName by rememberSaveable { mutableStateOf(_userName) }
    var password by rememberSaveable { mutableStateOf(_password) }
    var clickEnabled by rememberSaveable { mutableStateOf(true) }
    val coroutineScope = rememberCoroutineScope()

    LazyColumn(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(color = Color(0xFFFFFFFF))
    ) {
        item {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .clickable {
                        loginScreenInterface?.onBackPressed()
                    },
            ) {
                Image(
                    painterResource(id = R.drawable.back_arrow),
                    contentDescription = "Image1",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 37.dp, start = 27.dp)
                )
            }
        }

        // login title
        item {
            AppText(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 26.dp, end = 20.dp, top = 70.dp, bottom = 31.dp),
                textAlign = TextAlign.Start,
                fontStyle = FontStyle.BaseTextNumber2,
                color = Color(0xFF000000),
                text = stringResource(id = R.string.login),
            )
        }


        // email label
        item {
            AppText(
                modifier = Modifier.padding(start = 29.dp),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.BaseTextBoldBody1,
                color = Color(0xFF9796A1),
                text = stringResource(id = R.string.email),
            )
        }


        //email field
        item {
            AppTextField(
                textFieldStyle = TextFieldStyle.TextTextFieldWithError,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 27.dp, end = 24.dp, top = 12.dp)
                    .background(
                        color = colorResource(
                            id = R.color.white
                        )
                    ),
                textFieldBackgroundColor = R.color.white,
                value = stringResource(id = R.string.email_hint) ?: "01287864053",
                isError = _isError == true,
                textStyle = getTextStyle(FontStyle.BaseTextRegularBody3, TextAlign.Start),
                onValueChange = { userName = it },
                placeholder = {
//                AppText(
//                    fontStyle = FontStyle.BaseTextRegularBody3,
//                    text = stringResource(id = R.string.email_hint),
//                    color = colorResource(id = R.color.white),
//                    modifier = Modifier
//                        .wrapContentWidth()
//                )
                }
            )
        }

        //password label
        item {
            AppText(
                modifier = Modifier.padding(start = 29.dp, top = 29.dp),
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.BaseTextBoldBody1,
                color = Color(0xFF9796A1),
                text = stringResource(id = R.string.password),
            )
        }

        //password field

        item {
            AppTextField(
                textFieldStyle = TextFieldStyle.LoginPasswordTextFieldWithError,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 27.dp, end = 24.dp, top = 12.dp, bottom = 32.dp),
                textFieldBackgroundColor = R.color.white,
                value = password ?: "12345678",
                textStyle = getTextStyle(FontStyle.BaseTextRegularBody3, TextAlign.Start),
                isError = _isError == true,
                isArabic = isArabic,
                errorMsg = if (_errorMessage == stringResource(id = R.string.wrong_credentials_try_again)) stringResource(
                    id = R.string.error_wrong_login_password
                ) else stringResource(id = R.string.label_no_internet),
                onValueChange = { password = it },
                placeholder = {
//                AppText(
//                    fontStyle = FontStyle.BaseTextRegularBody3,
//                    text = stringResource(id = R.string.password_hint),
//                    color = colorResource(id = R.color.text_field),
//                    modifier = Modifier
//                        .fillMaxWidth()
//                )
                }
            )
        }


        //forgot password
        item {
            Row(
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .fillMaxWidth()
                    .clickable {
//                        loginScreenInterface?.onForgotPassword()
                    },
                horizontalArrangement = Arrangement.Center
            ) {
                AppText(
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.BaseTextBoldBody1,
                    color = colorResource(id = R.color.orange),
                    text = stringResource(id = R.string.forgot_password),
//                fontSize = 14.sp
                )
            }
        }

        // login button
        item {
            Row(
                modifier = Modifier
                    .padding(start = 63.dp, end = 63.dp, bottom = 32.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                AppButton(
                    buttonStyle = ButtonStyle.Button4Radius,
                    modifier = Modifier
                        .width(248.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(size = 28.dp),
                    isEnabled = true, // ((userName?.isNotEmpty() == true) && (password?.isNotEmpty() == true) && clickEnabled),
                    onClick = {
                        loginScreenInterface?.onLoginButtonClick(userName!!, password!!)
                        clickEnabled = false
                        coroutineScope.launch {
                            Handler().postDelayed(
                                { clickEnabled = true },
                                delayTime
                            )
                        }

                    }) {
                    AppText(
                        fontStyle = FontStyle.BaseTextBoldBody1,
                        text = stringResource(id = R.string.login),
                        color = colorResource(id = R.color.white),
//                    fontSize = 15.sp
                    )
                }
            }
        }

        // do not have an account ?
        item {
            Row(
                modifier = Modifier
                    .padding(start = 68.dp, end = 68.dp, bottom = 56.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                AppText(
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.BaseTextBoldBody1,
                    color = colorResource(id = R.color.font_semi_black),
                    text = stringResource(id = R.string.do_not_have_account),
//                fontSize = 14.sp
                )
                Spacer(modifier = Modifier.width(4.dp))
                AppText(
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.BaseTextBoldBody1,
                    color = colorResource(id = R.color.orange),
                    text = stringResource(id = R.string.signup),
//                fontSize = 14.sp
                )


            }
        }

        // sign in with
        item {
            Row(
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .width(120.dp)
                        .padding(start = 5.dp)
                        .background(color = Color(0xFFB3B3B3))
                )
                AppText(
                    modifier = Modifier.padding(start = 5.dp, end = 5.dp),
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.BaseTextBoldBody1,
                    color = colorResource(id = R.color.font_semi_black),
                    text = stringResource(id = R.string.sign_in_with),
//                fontSize = 14.sp
                )
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .width(120.dp)
                        .padding(end = 5.dp)
                        .background(color = Color(0xFFB3B3B3))
                )
            }
        }

        //social buttons
        item {
            Row(
                modifier = Modifier
                    .height(75.dp)
                    .padding(start = 25.dp, end = 25.dp, bottom = 28.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    facebookButton()
                }
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    googleButton()
                }
            }
        }
    }
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun PreviewLoginFunction() {
    Surface(modifier = Modifier.fillMaxSize()) {
        loginScreen()
    }
}