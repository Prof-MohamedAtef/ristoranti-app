package mo.ed.ristoranti.data.response.login

data class LoginResponseData(
    val token: String,
    val user: User
)