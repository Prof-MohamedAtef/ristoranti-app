package mo.ed.myristoranti.views.adapter

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.withCrossFade
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
import mo.ed.myristoranti.R
import mo.ed.myristoranti.data.response.fooditems.Product
import mo.ed.myristoranti.databinding.FoodListItemBinding
import javax.inject.Inject

class ProductsRecyclerAdapter @Inject constructor() : PagingDataAdapter<Product, ProductsRecyclerAdapter.ImageAdapterViewHolder>(ItemComparator) {
    var imageClickListener: ImageItemClickListener? = null
    override fun onBindViewHolder(holder: ProductsRecyclerAdapter.ImageAdapterViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsRecyclerAdapter.ImageAdapterViewHolder {
        TODO("Not yet implemented")
    }

    inner class ImageAdapterViewHolder(private val binding: FoodListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                imageClickListener?.onImageClicked(
                    binding,
                    getItem(absoluteAdapterPosition) as Product
                )
            }
        }

        fun bind(item: Product) = with(binding) {
            GlideApp.with(itemView.context)
                .load(item.image)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .transition(withCrossFade())
                .downsample(DownsampleStrategy.AT_MOST)
                .placeholder(R.drawable.food_item)
                .into(foodItemImage)
        }
    }

    object ItemComparator : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product) =
            oldItem.image == newItem.image

        override fun areContentsTheSame(oldItem: Product, newItem: Product) =
            oldItem == newItem
    }

    interface ImageItemClickListener {
        fun onImageClicked(binding: FoodListItemBinding, item: Product)
    }

}