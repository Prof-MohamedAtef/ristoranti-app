package mo.ed.myristoranti.data.domain.errors.exception

import mo.ed.myristoranti.data.domain.errors.exception.network.dto.ErrorsDto

abstract class BaseException : RuntimeException {

    var errorList: ErrorsDto? = null
    var serverErrorMessage = "" // This is used as a title in dialogs

    constructor(errorMessage: String?) : super(errorMessage)

    constructor(errorMessage: String?, serverErrorMessage: String?) : super(errorMessage) {
        if (serverErrorMessage != null) {
            this.serverErrorMessage = serverErrorMessage
        }
    }

    constructor(throwable: Throwable?) : super(throwable)

    constructor() : super()
}
