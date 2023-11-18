package mo.ed.ristoranti.base

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import mo.ed.myristoranti.R


enum class ButtonStyle {
    Button4Radius,
    ButtonFullWidth,
}

@Composable
fun <T> T.AppButton(
    buttonStyle: ButtonStyle,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
    shape: Shape = MaterialTheme.shapes.medium.copy(all = CornerSize(4.dp)),
    onClick: () -> Unit,
    color: Int = R.color.orange,
    content: @Composable T.() -> Unit,
) {

    when (buttonStyle) {
        ButtonStyle.Button4Radius -> Button4Radius(
            modifier = modifier,
            shape = shape,
            isEnabled = isEnabled,
            onClick = onClick,
            content = content,
            color = color
        )

        ButtonStyle.ButtonFullWidth -> ButtonFullWidth(
            modifier = modifier,
            isEnabled = isEnabled,
            onClick = onClick,
            content = content
        )
    }

}


@Composable
fun <T> T.ButtonFullWidth(
    modifier: Modifier,
    isEnabled: Boolean,
    shape: Shape = CutCornerShape(0),
    onClick: () -> Unit,
    content: @Composable T.() -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.orange),
            disabledContainerColor = colorResource(id = R.color.orange)
        ),
        contentPadding = PaddingValues(
            start = 10.dp,
            end = 10.dp,
            top = 12.dp,
            bottom = 12.dp
        ),
        shape = shape,
        enabled = isEnabled,
        onClick = { onClick() }
    ) { content() }
}


@Composable
fun <T> T.Button4Radius(
    modifier: Modifier,
    isEnabled: Boolean,
    shape: Shape = MaterialTheme.shapes.medium.copy(all = CornerSize(4.dp)),
    onClick: () -> Unit,
    content: @Composable T.() -> Unit,
    color: Int = R.color.orange
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            colorResource(id = color),
            disabledContainerColor = colorResource(id = color)
        ),
        enabled = isEnabled,
        shape = shape,
        onClick = { onClick() }
    ) { content() }
}