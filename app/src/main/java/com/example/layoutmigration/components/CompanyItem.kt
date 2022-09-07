package com.example.layoutmigration.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutmigration.CompanyDataSource
import com.example.layoutmigration.R
import com.example.layoutmigration.model.Company

@Composable
fun CompanyItem(company: Company, onClick : () -> Unit){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.dimen_16dp))
            .clickable { onClick.invoke() },
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column() {
            Text(
                text = company.name,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Text(text = company.sector)
        }

        Text(text = "${company.startDate} - ${company.endDate}")
    }
}

@Preview(showBackground = true)
@Composable
fun CompanyItemPreview(company: Company = CompanyDataSource().loadCompany()[0]){
    CompanyItem(company = company){}
}