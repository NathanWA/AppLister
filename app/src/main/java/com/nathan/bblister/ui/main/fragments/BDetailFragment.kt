package com.nathan.bblister.ui.main.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nathan.bblister.R
import com.nathan.bblister.databinding.FragmentBDetailBinding
import com.nathan.bblister.viewmodel.AdsViewModel
import kotlinx.android.synthetic.main.fragment_b_detail.*


/**
 * Fragment responsible for showing detail about a specific product
 */
class BDetailFragment : Fragment() {

    //use view model from activity scope
    val viewModel by lazy {
        ViewModelProvider(requireActivity()).get(AdsViewModel::class.java)
    }


    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        buttonLink.setOnClickListener {
            //find url for product
            val url = viewModel.selectedProduct.value?.clickProxyURL
            if(url!=null) {
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }
        }
        textViewPrivacyPolicy.setOnClickListener {
            val url = viewModel.selectedProduct.value?.appPrivacyPolicyUrl
            if(url!=null) {
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //we need to do some things for data binding.
        //Fun part here is guessing the name of the automatically generated Databinding class
        val binding: FragmentBDetailBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_b_detail,container,false)
        // Lifecycle is tied to fragment
        binding.lifecycleOwner = this
        //set viewmodel for the data binding
        binding.viewModel = viewModel

        return binding.root
    }


}