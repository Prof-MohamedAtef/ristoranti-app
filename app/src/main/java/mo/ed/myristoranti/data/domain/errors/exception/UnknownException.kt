package mo.ed.myristoranti.data.domain.errors.exception

import android.content.Context
import dagger.hilt.android.EntryPointAccessors

class UnknownException  : BaseException {
    override var message: String = ""
    constructor(context: Context) : super() {
        kotlin.runCatching {
            message = ""
        }.onFailure {
            message = "Something went wrong, please try again later."
        }
    }
}