package mo.ed.ristoranti.composableui.walkthrough

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import mo.ed.myristoranti.R
import mo.ed.myristoranti.data.models.OnBoardingItems
import mo.ed.ristoranti.listeners.InterfaceListeners

@ExperimentalPagerApi
@Composable
fun onBoarding(walkthroughScreenInterface: InterfaceListeners.WalkthroughInterface? = null,) {
    val items = OnBoardingItems.getData()
    val pageState = rememberPagerState()

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            count = items.size,
            state = pageState,
            modifier = Modifier
                .weight(7f)
                .padding(top = 74.dp)
                .fillMaxHeight()
                .fillMaxWidth()
        ) { page ->
            OnBoardingItem(items = items[page], size = items.size, index = pageState.currentPage)
        }
        Box(
            modifier = Modifier.fillMaxWidth().weight(2f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painterResource(id = R.drawable.orange_arrow),
                contentDescription = "Image1",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .padding(bottom = 50.dp)
                    .clickable {
                        walkthroughScreenInterface?.onWalkthroughButtonClick()
                    }
            )
        }
    }
}

@Composable
fun ColumnScope.Indicators(size: Int, index: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.align(Alignment.CenterHorizontally)
    ) {
        repeat(size) {
            Indicator(isSelected = it == index)
        }
    }
}

@Composable
fun Indicator(isSelected: Boolean) {
    val width = animateDpAsState(
        targetValue = if (isSelected) 25.dp else 10.dp,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )

    Box(
        modifier = Modifier
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                color = if (isSelected) Color(0XFFFFC529) else Color(0XFFFFC529)
            )
    ) {

    }
}

@Composable
fun OnBoardingItem(items: OnBoardingItems, size: Int, index: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = items.image),
            contentDescription = "Image1",
            modifier = Modifier
                .width(310.dp)
                .height(310.dp)
                .padding(start = 34.dp, end = 31.dp)
        )
        
        Indicators(size = size, index = index)

        Text(
            text = stringResource(id = items.title),
            style = MaterialTheme.typography.headlineMedium,
            // fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 1.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp, end = 20.dp, top = 33.dp, bottom = 16.dp)
        )

        Text(
            text = stringResource(id = items.desc),
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFF616772),
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp),
            letterSpacing = 1.sp,
        )
    }
}