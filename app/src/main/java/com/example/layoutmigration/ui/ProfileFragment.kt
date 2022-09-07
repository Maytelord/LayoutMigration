package com.example.layoutmigration.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.layoutmigration.databinding.ProfileFragmentBinding
import com.example.layoutmigration.screens.ProfileScreen
import com.google.android.material.composethemeadapter.MdcTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment: Fragment() {
    private lateinit var binding: ProfileFragmentBinding
    private val companyAdapter = CompanyAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel: ProfileViewModel by viewModels()
        binding = ProfileFragmentBinding.inflate(inflater, container, false)
        context ?: return binding.root


        binding.viewModel = viewModel
       // companyAdapter.submitList(viewModel.companyData.value)

        binding.composeView.setContent {
            //MaterialTheme {
            MdcTheme{
                ProfileScreen(viewModel, onNavigate = { dest -> findNavController().navigate(dest) })
            }
        }
        //postRVSetup()

        return binding.root
    }


   /* private fun postRVSetup() = with(binding.companyRV){
        val postLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))

        layoutManager = postLayoutManager
        adapter = companyAdapter
    }*/


}