package mo.ed.ristoranti.data.response.login

data class User(
    val address: String,
    val country_code: String,
    val currency: String,
    val id: Int,
    val image: String,
    val is_verified: Int,
    val language: String,
    val name: String,
    val newCountryCode: String,
    val newPhone: String,
    val phone: String
)