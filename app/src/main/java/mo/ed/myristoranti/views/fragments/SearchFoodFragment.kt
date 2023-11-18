package mo.ed.ristoranti.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mo.ed.myristoranti.databinding.SearchFoodFragmentBinding
import mo.ed.myristoranti.views.fragments.BaseFragment

class SearchFoodFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = SearchFoodFragmentBinding.inflate(inflater)
        return binding.root
    }
}