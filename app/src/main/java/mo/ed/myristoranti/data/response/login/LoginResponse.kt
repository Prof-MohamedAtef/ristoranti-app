package mo.ed.ristoranti.data.response.login

data class LoginResponse(
    val `data`: LoginResponseData,
    val message: String,
    val result: Boolean,
    val status: Int
)