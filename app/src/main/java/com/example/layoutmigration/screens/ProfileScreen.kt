package com.example.layoutmigration.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.layoutmigration.R
import com.example.layoutmigration.UserDisplay
import com.example.layoutmigration.components.CVButton
import com.example.layoutmigration.components.CompanyItem
import com.example.layoutmigration.ui.ProfileViewModel

@Composable
fun ProfileScreen(viewModel: ProfileViewModel) {
    val context = LocalContext.current
    Surface() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            viewModel.userData.value?.let {
                UserDisplay(user = it)
            }

            CVButton(false){

                Toast.makeText(context, R.string.toast, Toast.LENGTH_LONG).show()
            }
            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn{
                items(viewModel.companyData.value!!){
                    CompanyItem(company = it)
                    Divider(color = Color.Gray)
                }
            }
        }

    }


}