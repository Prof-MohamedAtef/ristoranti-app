package mo.ed.myristoranti.ui.uistates

import mo.ed.myristoranti.data.models.ViewState
import mo.ed.myristoranti.data.response.fooditems.FoodItemResponseData
import mo.ed.ristoranti.data.response.login.LoginResponseData

data class LoginUIState(
    val data: LoginResponseData? = null,
    val viewState: ViewState,
)