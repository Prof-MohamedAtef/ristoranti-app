package mo.ed.ristoranti.base

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mo.ed.myristoranti.R
import mo.ed.myristoranti.ui.theme.sofiaProFamily


val sofiaFamilyBold = FontFamily(Font(R.font.sofia_pro_semi_bold, FontWeight.Bold))

enum class FontStyle {
    BaseTextLightBody1,
    BaseTextRegularBody1,
    BaseTextMediumBody1,
    BaseTextBoldBody1,
    BaseTextLightBody2,
    BaseTextRegularBody2,
    BaseTextMediumBody2,
    BaseTextBoldBody2,
    BaseTextLightBody3,
    BaseTextRegularBody3,
    BaseTextMediumBody3,
    BaseTextBoldBody3,
    BaseTextLightBody4,
    BaseTextLightHeading1,
    BaseTextRegularHeading1,
    BaseTextMediumHeading1,
    BaseTextBoldHeading1,
    BaseTextLightHeading2,
    BaseTextRegularHeading2,
    BaseTextMediumHeading2,
    BaseTextBoldHeading2,
    BaseTextLightHeading3,
    BaseTextRegularHeading3,
    BaseTextMediumHeading3,
    BaseTextBoldHeading3,
    BaseTextNumber1,
    BaseTextNumber2,
    BaseTextNumber3,
    BaseTextNumber4,
    BaseTextNumber5,
    BaseTextNumber6,
}

@Composable
fun AppText(fontStyle: FontStyle, text: String, color: Color = Color.Black, modifier: Modifier = Modifier, textAlign: TextAlign? = null, softWrap : Boolean = true, maxLines: Int = 100){

    when(fontStyle) {
        FontStyle.BaseTextLightBody1 -> BaseTextLightBody1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightBody2 -> BaseTextLightBody2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightBody3 -> BaseTextLightBody3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularBody1 -> BaseTextRegularBody1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularBody2 -> BaseTextRegularBody2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularBody3 -> BaseTextRegularBody3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumBody1 -> BaseTextMediumBody1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumBody2 -> BaseTextMediumBody2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumBody3 -> BaseTextMediumBody3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldBody1 -> BaseTextBoldBody1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldBody2 -> BaseTextBoldBody2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldBody3 -> BaseTextBoldBody3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightBody4 -> BaseTextLightBody4(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightHeading1 -> BaseTextLightHeading1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightHeading2 -> BaseTextLightHeading2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextLightHeading3 -> BaseTextLightHeading3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularHeading1 -> BaseTextRegularHeading1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularHeading2 -> BaseTextRegularHeading2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextRegularHeading3 -> BaseTextRegularHeading3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumHeading1 -> BaseTextMediumHeading1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumHeading2 -> BaseTextMediumHeading2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextMediumHeading3 -> BaseTextMediumHeading3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldHeading1 -> BaseTextBoldHeading1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldHeading2 -> BaseTextBoldHeading2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextBoldHeading3 -> BaseTextBoldHeading3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber1 -> BaseTextNumber1(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber2 -> BaseTextNumber2(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber3 -> BaseTextNumber3(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber4 -> BaseTextNumber4(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber5 -> BaseTextNumber5(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
        FontStyle.BaseTextNumber6 -> BaseTextNumber6(text, color = color, modifier = modifier, textAlign = textAlign, maxLines = maxLines, softWrap = softWrap)
    }
}

@Composable
fun BaseTextMediumHeading1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 30.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 44.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextRegularHeading1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 30.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 44.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightBody1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 15.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight
        ),
    )
}

@Composable
fun BaseTextRegularBody1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 15.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextMediumBody1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 15.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        modifier = modifier,
        text = text,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextBoldBody1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 15.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}


@Composable
fun BaseTextLightBody2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 13.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 18.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextRegularBody2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 13.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 18.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

/*
//styleName: Light Theme/Android/Body 2/Medium;
font-family: STC Forward;
font-size: 13px;
font-weight: 500;
line-height: 18px;
letter-spacing: 0em;
text-align: left;

 */

@Composable
fun BaseTextMediumBody2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 13.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 18.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextBoldBody2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 13.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 18.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightBody3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 11.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 16.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

/*
//styleName: Light Theme/Android/Body 3/Regular;
font-family: STC Forward;
font-size: 11px;
font-weight: 400;
line-height: 16px;
letter-spacing: 0em;
text-align: left;
 */
@Composable
fun BaseTextRegularBody3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 11.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 16.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

/*
//styleName: Light Theme/Android/Body 3/Medium;
font-family: STC Forward;
font-size: 11px;
font-weight: 500;
line-height: 16px;
letter-spacing: 0em;
text-align: left;

 */
@Composable
fun BaseTextMediumBody3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 11.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 16.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextBoldBody3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 11.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 16.sp,
    letterSpacing: TextUnit? = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightBody4(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 8.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 11.sp,
    letterSpacing: TextUnit? = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null, softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            lineHeight = lineHeight,
        ),
    )
}


@Composable
fun BaseTextBoldHeading1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 30.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 44.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightHeading2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 21.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 32.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextRegularHeading2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 21.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 32.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextMediumHeading2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 21.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 32.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextBoldHeading2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 21.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 32.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightHeading3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 19.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 26.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextRegularHeading3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 19.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 26.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Normal),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextMediumHeading3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Medium,
    fontSize: TextUnit = 19.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 26.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Medium),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextBoldHeading3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 19.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 26.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextNumber1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 42.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}
@Composable
fun BaseTextNumber2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 35.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextNumber3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 29.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}
/*
//styleName: Light Theme/Android/Number/Number 4;
font-family: STC Forward;
font-size: 24px;
font-weight: 700;
line-height: 29px;
letter-spacing: 0em;
text-align: left;

 */

@Composable
fun BaseTextNumber4(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 24.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        softWrap = softWrap,
        textAlign = textAlign,
        overflow = overflow,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextNumber5(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 20.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextNumber6(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Bold,
    fontSize: TextUnit = 17.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 20.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Bold),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        softWrap = softWrap,
        overflow = overflow,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@Composable
fun BaseTextLightHeading1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = 30.sp,
    fontFamily: FontFamily = sofiaProFamily,
    lineHeight: TextUnit = 44.sp,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    style: TextStyle = TextStyle(fontWeight = FontWeight.Light),
    maxLines: Int = 1,
    textAlign: TextAlign? = null,
    softWrap : Boolean
) {

    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        style = style.copy(
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        ),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberTextField(
    modifier: Modifier,
    value: String,
    textStyle: TextStyle,
    keyboardType: KeyboardType = KeyboardType.Number,
    isSingleLine: Boolean = true,
    textFieldBackgroundColor: Int = R.color.text_field,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit
){

    Column{
        TextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                textColor = colorResource(id = R.color.white),
//                backgroundColor = colorResource(id = textFieldBackgroundColor),
                focusedIndicatorColor =  colorResource(id = R.color.text_field),
                unfocusedIndicatorColor = colorResource(id = R.color.text_field),
                cursorColor = colorResource(id = R.color.text_field)
            ),
            singleLine = isSingleLine,
            textStyle = textStyle,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            label = label,
            shape = RoundedCornerShape(4.dp),
            placeholder = placeholder
        )
    }
}
