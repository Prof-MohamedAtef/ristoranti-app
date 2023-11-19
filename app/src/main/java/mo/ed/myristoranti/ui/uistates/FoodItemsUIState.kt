package mo.ed.myristoranti.ui.uistates

import mo.ed.myristoranti.data.models.ViewState
import mo.ed.myristoranti.data.response.fooditems.FoodItemResponseData

data class FoodItemsUIState(
    val data: FoodItemResponseData? = null,
    val viewState: ViewState,
)