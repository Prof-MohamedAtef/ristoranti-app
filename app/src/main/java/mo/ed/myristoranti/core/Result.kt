package mo.ed.myristoranti.core

import mo.ed.myristoranti.data.domain.errors.exception.BaseException

sealed class Result<out T> {

    data class Success<out T>(val data: T?, var isInternetAvailable: Boolean? = true) : Result<T>()
    data class Loading(val nothing: Nothing? = null) : Result<Nothing>()
    data class Failure(val exception: BaseException? = null, val data: Any? = null) : Result<Nothing>()
}