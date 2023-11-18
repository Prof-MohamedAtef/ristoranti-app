package mo.ed.myristoranti.data.response.fooditems

data class Offer(
    val percentage: Int,
    val priceAfterDiscount: Int,
    val remainingDays: Int
)