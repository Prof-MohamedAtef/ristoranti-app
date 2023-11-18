package mo.ed.myristoranti.network.api

import mo.ed.myristoranti.data.response.fooditems.FoodItemResponse
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("/foodItem/public/api/foodItem")
    suspend fun getImages(): List<FoodItemResponse>

//    @POST("/foodItem/public/api/users/login")
//    suspend fun login(@Body)
}