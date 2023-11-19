package mo.ed.myristoranti.data.domain.errors.exception

class EmptyDataException : BaseException() {

    override var message: String = ""

    init {
        message = "Empty Data Exception"
    }
}
