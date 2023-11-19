package mo.ed.myristoranti.views.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import mo.ed.myristoranti.R
import mo.ed.myristoranti.data.response.fooditems.FoodItemResponseData
import mo.ed.myristoranti.data.response.fooditems.Product
import mo.ed.myristoranti.databinding.ActivityHomeBinding
import mo.ed.myristoranti.databinding.FoodListItemBinding
import mo.ed.myristoranti.viewmodels.FoodItemsViewModel
import mo.ed.myristoranti.views.adapter.PagingLoadStateAdapter
import mo.ed.myristoranti.views.adapter.ProductsRecyclerAdapter
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : BaseActivity(),
    ProductsRecyclerAdapter.ImageItemClickListener{

    private val foodItemsViewModel: FoodItemsViewModel by viewModels()

    private lateinit var binding: ActivityHomeBinding

    private lateinit var rvItems: RecyclerView

    @Inject
    lateinit var productsAdapter: ProductsRecyclerAdapter

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        foodItemsViewModel.getFoodItems()

        setupObserver()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.categorySelectionLayout.txtFoodItem.setOnClickListener {
            it.background = getDrawable(R.drawable.rounded_orange_category_rectangle)
            binding.categorySelectionLayout.txtRestaurant.background = null
            binding.categorySelectionLayout.txtFoodItem.setTextColor(R.color.orange)
            binding.categorySelectionLayout.txtRestaurant.setTextColor(R.color.white)
        }
        binding.categorySelectionLayout.txtRestaurant.setOnClickListener {
            it.background = getDrawable(R.drawable.rounded_orange_category_rectangle)
            binding.categorySelectionLayout.txtFoodItem.background = null
            binding.categorySelectionLayout.txtRestaurant.setTextColor(R.color.orange)
            binding.categorySelectionLayout.txtFoodItem.setTextColor(R.color.white)
        }

        binding.titleLayout.arrowBack.setOnClickListener {
            this.startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun setupObserver() {
        val foodItemsObserver = foodItemsViewModel.foodItemsResponse.value
        foodItemsObserver.data?.let {
            populateRecyclerView(it)
        }
    }

    private fun populateRecyclerView(productsList: FoodItemResponseData) {
        val rLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rLayoutManager.gapStrategy =
            StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        with(productsAdapter) {
            rvItems.apply {
                postponeEnterTransition()
                viewTreeObserver.addOnPreDrawListener {
                    startPostponedEnterTransition()
                    true
                }
                layoutManager = rLayoutManager
            }
            rvItems.adapter = withLoadStateHeaderAndFooter(
                header = PagingLoadStateAdapter(this),
                footer = PagingLoadStateAdapter(this)
            )
        }
    }

    override fun onImageClicked(binding: FoodListItemBinding, item: Product) {
        val intent = Intent(this@HomeActivity, ProductDetailsActivity::class.java)
        intent.putExtra("item", item)
        startActivity(intent)
    }
}