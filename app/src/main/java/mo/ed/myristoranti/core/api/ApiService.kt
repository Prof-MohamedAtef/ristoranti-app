package mo.ed.myristoranti.core.api

import mo.ed.myristoranti.core.utils.NetworkResultWrapper
import mo.ed.myristoranti.data.domain.network.NetworkConstants
import mo.ed.myristoranti.data.response.fooditems.FoodItemResponse
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Tag
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getFoodItems(@Url url: String, @Tag apiName: NetworkConstants.NetworkEvents): NetworkResultWrapper<FoodItemResponse>

//    @POST("/foodItem/public/api/users/login")
//    suspend fun login(@Body)
}