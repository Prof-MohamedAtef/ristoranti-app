package mo.ed.myristoranti.views.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import mo.ed.myristoranti.R
import mo.ed.myristoranti.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding

    private lateinit var rvItems: RecyclerView

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        binding.categorySelectionLayout.txtFoodItem.setOnClickListener{
            it.background = getDrawable(R.drawable.rounded_orange_category_rectangle)
            binding.categorySelectionLayout.txtRestaurant.background = null
            binding.categorySelectionLayout.txtFoodItem.setTextColor(R.color.orange)
            binding.categorySelectionLayout.txtRestaurant.setTextColor(R.color.white)
        }
        binding.categorySelectionLayout.txtRestaurant.setOnClickListener{
            it.background = getDrawable(R.drawable.rounded_orange_category_rectangle)
            binding.categorySelectionLayout.txtFoodItem.background = null
            binding.categorySelectionLayout.txtRestaurant.setTextColor(R.color.orange)
            binding.categorySelectionLayout.txtFoodItem.setTextColor(R.color.white)
        }

        binding.titleLayout.arrowBack.setOnClickListener{
            this.startActivity(Intent(this, MainActivity::class.java))
        }
    }
}