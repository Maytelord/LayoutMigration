package com.example.layoutmigration.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.layoutmigration.data.CompanyDataInterface
import com.example.layoutmigration.data.UserDataInterface
import com.example.layoutmigration.model.Company
import com.example.layoutmigration.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val companyDataSource: CompanyDataInterface, private val userDataSource: UserDataInterface): ViewModel() {


    private val _userData : MutableLiveData<User> = MutableLiveData()
    val userData: LiveData<User> get() = _userData

    private val _companyData : MutableLiveData<List<Company>> = MutableLiveData()
    val companyData: LiveData<List<Company>> get() = _companyData

    init {
        getUserData()
        getCompanyData()
    }

    private fun getUserData() {
        _userData.value = userDataSource.userData()
    }

    private fun getCompanyData() {
        _companyData.value = companyDataSource.loadCompany()
    }
}