package mo.ed.myristoranti.data.dto

import com.google.gson.annotations.SerializedName

data class LoginUserRequestBody(
    @SerializedName("phone") val phone: String,
    @SerializedName("device_name") val device_name: String,
    @SerializedName("password") val password: String
)
