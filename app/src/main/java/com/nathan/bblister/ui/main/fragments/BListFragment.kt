package com.nathan.bblister.ui.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.nathan.bblister.R
import com.nathan.bblister.api.Ads
import com.nathan.bblister.ui.main.adapters.AdListAdapter
import com.nathan.bblister.viewmodel.AdsViewModel

import kotlinx.android.synthetic.main.fragment_b_list.*

class BListFragment : Fragment() {

    //use view model from activity scope
    val viewModel by lazy {
        ViewModelProvider(requireActivity()).get(AdsViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_list, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.productList.observe(viewLifecycleOwner, Observer {
            setupRecyclerView(it)
        })
        viewModel.retrieveListings()
    }

    fun setupRecyclerView(plist: Ads)
    {
        recyclerViewOfProducts.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            adapter =
                AdListAdapter(plist) {
                    viewModel.selectProduct(it)
                    findNavController().navigate(R.id.action_BListFragment_to_BDetailFragment)
                }
        }
    }
}