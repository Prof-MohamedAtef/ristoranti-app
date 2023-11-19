package mo.ed.myristoranti.data.domain.errors.exception.network.dto

import com.google.gson.annotations.SerializedName

data class ErrorsDto(@SerializedName("errors") val errors: ArrayList<ErrorDto>)

data class ErrorDto(
    @SerializedName("code") val code: String = "",
    @SerializedName("message") val message: String?,
    @SerializedName("sourceErrorCode") val sourceErrorCode: String?,
)