package com.example.layoutmigration

import com.example.layoutmigration.data.CompanyDataInterface
import com.example.layoutmigration.data.UserDataInterface
import com.example.layoutmigration.model.Company
import com.example.layoutmigration.model.User
import javax.inject.Inject

class CompanyDataSource @Inject constructor(): CompanyDataInterface {
    override fun loadCompany(): List<Company>{
        return listOf(
            Company(name = "Company 1", sector = "Retail", startDate = "01/01/2021", endDate = "01/01/2022"),
            Company(name = "Company 2", sector = "Construction", startDate = "01/01/2019", endDate = "01/01/2021"),
            Company(name = "Company 3", sector = "Technology", startDate = "01/01/2017", endDate = "01/01/2019"),
            Company(name = "Company 4", sector = "Financial", startDate = "01/01/2015", endDate = "01/01/2017"),
        )
    }
}

class UserDataSource @Inject constructor(): UserDataInterface{
    override fun userData() = User(name = "Mayté Cabral", occupation = "Mobile Developer")
}