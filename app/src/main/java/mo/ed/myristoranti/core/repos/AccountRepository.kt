package mo.ed.myristoranti.core.repos

import android.content.Context
import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.core.api.ApiService
import mo.ed.myristoranti.core.api.EndPointObject
import mo.ed.myristoranti.core.utils.NetworkResultWrapper
import mo.ed.myristoranti.data.domain.errors.exception.BaseException
import mo.ed.myristoranti.data.domain.errors.exception.EmptyDataException
import mo.ed.myristoranti.data.domain.errors.exception.UnknownException
import javax.inject.Inject

class AccountRepository @Inject constructor(
    private val context: Context,
    internal val apiService: ApiService,
): BaseRepo() {
    suspend fun getFoodItems(endPointObject: EndPointObject): Result<Any> {
//        cacheNotImplementedIntentionally(endPointObject)
        kotlin.runCatching {
            apiService.getFoodItems(endPointObject.endPoint, endPointObject.networkEvents).also {
                return when (it) {
                    is NetworkResultWrapper.Success<*, *> -> {
                        Result.Success(it.data)
                    }
                    is NetworkResultWrapper.Failure -> {
                        Result.Failure(it.throwable as? BaseException)
                    }
                    is NetworkResultWrapper.NotModified -> {
                        Result.Failure(EmptyDataException())
                    }
                    is NetworkResultWrapper.NetworkNotReachable -> {
                        Result.Failure(it.throwable as? BaseException)
                    }
                    is NetworkResultWrapper.NotDataFound -> {
                        Result.Success(null)
                    }
                }
            }
        }.onFailure { return handleError(context, it) }
        return Result.Failure(UnknownException(context))
    }
}