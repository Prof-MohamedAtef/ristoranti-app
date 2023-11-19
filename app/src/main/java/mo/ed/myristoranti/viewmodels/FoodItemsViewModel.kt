package mo.ed.myristoranti.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.data.domain.account.AccountsInteractor
import mo.ed.myristoranti.data.models.ViewState
import mo.ed.myristoranti.data.response.fooditems.FoodItemResponseData
import mo.ed.myristoranti.di.ApplicationModule
import mo.ed.myristoranti.ui.uistates.FoodItemsUIState
import mo.ed.myristoranti.ui.uistates.LoginUIState
import mo.ed.ristoranti.data.response.login.LoginResponseData
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class FoodItemsViewModel @Inject constructor(
    @ApplicationModule.IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val accountsInteractor: AccountsInteractor,
) : ViewModel() {

    private var _foodItemsResponse = MutableStateFlow(FoodItemsUIState(viewState = ViewState.LOADING))
    val foodItemsResponse = _foodItemsResponse.asStateFlow()

    private var _loginResponse = MutableStateFlow(LoginUIState(viewState = ViewState.LOADING))
    val loginResponse = _loginResponse.asStateFlow()


    fun userLogin(phone: String, password: String, deviceName: String) {
        _loginResponse.update { it.copy(viewState = ViewState.LOADING) }
        viewModelScope.launch(ioDispatcher) {
            Timber.e("--> Username: $phone")
            Timber.e("--> Password: $password")
            accountsInteractor.login(phone, password, deviceName).let { response ->
                when (response) {
                    is Result.Success -> {
                        val login = response.data as? LoginResponseData
                        _loginResponse.update { it.copy(viewState = ViewState.SUCCESS, data = login) }
                    }

                    is Result.Failure -> {
                        _loginResponse.update { it.copy(viewState = ViewState.ERROR, data = null) }
                    }

                    else -> {
                        _loginResponse.update { it.copy(viewState = ViewState.EMPTY, data = null) }
                    }
                }
            }
        }
    }

    fun getFoodItems(){
        _foodItemsResponse.update { it.copy(viewState = ViewState.LOADING) }
        viewModelScope.launch(ioDispatcher) {
            accountsInteractor.getFoodItems().let {response->
                when (response) {
                    is Result.Success -> {
                        val foodItems = response.data as? FoodItemResponseData
                        _foodItemsResponse.update { it.copy(viewState = ViewState.SUCCESS, data = foodItems) }
                    }

                    is Result.Failure -> {
                        _foodItemsResponse.update { it.copy(viewState = ViewState.ERROR, data = null) }
                    }

                    else -> {
                        _foodItemsResponse.update { it.copy(viewState = ViewState.EMPTY, data = null) }
                    }
                }
            }
        }
    }
}