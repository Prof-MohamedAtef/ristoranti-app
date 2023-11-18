package mo.ed.myristoranti.data.response.fooditems

data class FoodItemResponse(
    val `data`: Data,
    val message: String,
    val result: Boolean,
    val status: Int
)