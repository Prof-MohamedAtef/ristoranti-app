package mo.ed.ristoranti.base

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mo.ed.myristoranti.R
import mo.ed.myristoranti.ui.theme.sofiaProFamily


enum class TextFieldStyle{
    TextTextFieldWithError,
    LoginPasswordTextFieldWithError,
}

@Composable
fun AppTextField(
    textFieldStyle: TextFieldStyle,
    modifier: Modifier,
    value: String,
    textStyle: TextStyle,
    isError: Boolean = false,
    errorMsg: String = "",
    progress: Float = 0f,
    progressBarColor: Color = colorResource(id = R.color.white),
    trackColor: Color = colorResource(id = R.color.white),
    progressHint: String = "",
    keyboardType: KeyboardType = KeyboardType.Text,
    textFieldBackgroundColor: Int = R.color.white,
    cursorColor:Int=R.color.white,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    isArabic: Boolean = false,
    onValueChange: (String) -> Unit)
{

    when (textFieldStyle) {
        TextFieldStyle.TextTextFieldWithError -> TextTextFieldWithError(modifier = modifier,value = value, isError = isError, keyboardType = keyboardType, errorMsg = errorMsg, textFieldBackgroundColor = textFieldBackgroundColor,textStyle = textStyle, onValueChange = onValueChange, placeholder = placeholder, label = label)
        TextFieldStyle.LoginPasswordTextFieldWithError -> LoginPasswordTextFieldWithError(modifier = modifier, value = value, errorMsg = errorMsg, isError = isError, onValueChange = onValueChange, placeholder = placeholder, label = label, isArabic = isArabic)

        else -> {}
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextTextFieldWithError(
    modifier: Modifier,
    value: String,
    errorMsg: String,
    textStyle: TextStyle,
    textFieldBackgroundColor: Int = R.color.white,
    keyboardType: KeyboardType = KeyboardType.Text,
    isError: Boolean = false,
    isSingleLine: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit
){

    var errorColor = colorResource(id = R.color.orange)
    if (isError) errorColor = colorResource(id = R.color.orange)

    Column{
        TextField(
            modifier = modifier.border(
                width = 1.dp,
                color = errorColor,
                shape = RoundedCornerShape(4.dp)
            ),
            value = value,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                textColor = colorResource(id = R.color.white),
//                backgroundColor = colorResource(id = textFieldBackgroundColor),
                focusedIndicatorColor =  colorResource(id = R.color.white),
                unfocusedIndicatorColor = colorResource(id = R.color.white),
                cursorColor = colorResource(id = R.color.white)
            ),
            singleLine = isSingleLine,
            textStyle = textStyle,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            shape = RoundedCornerShape(4.dp),
            placeholder = placeholder
        )

        if (isError && errorMsg != ""){
            AppText(
                modifier = Modifier
                    .padding(top = 8.dp),
                fontStyle = FontStyle.BaseTextMediumBody3,
                text = errorMsg,
                color = errorColor
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPasswordTextFieldWithError(
    modifier: Modifier,
    visualTransformation: VisualTransformation = PasswordVisualTransformation(),
    value: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    isSingleLine: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
    errorMsg: String,
    isError: Boolean = false,
    isArabic: Boolean = false
){
    var passwordIcon = remember {
        mutableStateOf(R.drawable.ic_trailing_hide)
    }

    var visualTransformationType = remember {
        mutableStateOf(visualTransformation)
    }

    var isPasswordVisible = remember {
        mutableStateOf(false)
    }

    var errorColor = colorResource(id = R.color.orange)
    if (isError) errorColor = colorResource(id = R.color.orange)

    Column{
        TextField(
            modifier = modifier.border(
                width = 1.dp,
                color = errorColor,
                shape = RoundedCornerShape(4.dp)
            ),
            value = value,
            onValueChange = onValueChange,
            trailingIcon = {
                if (visualTransformation == PasswordVisualTransformation()){
                    Icon(
                        modifier = Modifier
                            .size(14.dp)
                            .clickable {
                                if (isPasswordVisible.value) {
                                    isPasswordVisible.value = false
                                    passwordIcon.value = R.drawable.ic_trailing_hide
                                    visualTransformationType.value = PasswordVisualTransformation()
                                } else {
                                    isPasswordVisible.value = true
                                    passwordIcon.value = R.drawable.ic_trailing
                                    visualTransformationType.value = VisualTransformation.None
                                }
                            },
                        painter = painterResource(id = passwordIcon.value),
                        contentDescription = null,
                        tint = colorResource(id = R.color.white),
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = colorResource(id = R.color.white),
//                backgroundColor = colorResource(id = R.color.text_field),
                focusedIndicatorColor =  colorResource(id = R.color.white),
                unfocusedIndicatorColor = colorResource(id = R.color.white),
                cursorColor = colorResource(id = R.color.white)
            ),
            singleLine = isSingleLine,
            visualTransformation = visualTransformationType.value,
            textStyle = TextStyle(
                fontSize = 11.sp,
                lineHeight = 16.sp,
                fontFamily = sofiaProFamily,
                fontWeight = FontWeight.Normal,
                textAlign = if (isArabic) TextAlign.Right  else TextAlign.Left,
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            shape = RoundedCornerShape(4.dp),
            placeholder = placeholder
        )

        if (isError && errorMsg != "") {
            AppText(
                modifier = Modifier
                    .padding(top = 8.dp),
                fontStyle = FontStyle.BaseTextMediumBody3,
                text = errorMsg,
                color = errorColor
            )
        }
    }
}
