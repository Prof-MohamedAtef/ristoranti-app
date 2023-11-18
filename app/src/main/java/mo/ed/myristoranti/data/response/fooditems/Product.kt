package mo.ed.myristoranti.data.response.fooditems

data class Product(
    val calories: Int,
    val currency: String,
    val description: String,
    val discount: Int,
    val favourite: Int,
    val hasOffer: Boolean,
    val id: Int,
    val image: String,
    val name: String,
    val offer: Offer,
    val price: Double,
    val rating: Rating
)