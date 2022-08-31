package com.example.layoutmigration.data

import com.example.layoutmigration.model.Company

interface CompanyDataInterface {
    fun loadCompany(): List<Company>
}