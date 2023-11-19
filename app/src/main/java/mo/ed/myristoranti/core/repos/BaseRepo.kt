package mo.ed.myristoranti.core.repos

import android.content.Context
import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.data.domain.errors.exception.BaseException
import timber.log.Timber

open class BaseRepo {
//    fun cacheNotImplementedIntentionally(endPointObject: EndPointObject) {
//        if (endPointObject.cache != Cache.Policy.NO_CACHE) {
//            throw CacheNotImplementedIntentionally()
//        }
//    }
    fun handleError(context: Context, it: Throwable): Result.Failure {
        Timber.e("handleError Exception: $it")
        return when (it) {
            is BaseException -> {
                Result.Failure(it)
            }
            else -> {
                Result.Failure()
            }
        }
    }
}
