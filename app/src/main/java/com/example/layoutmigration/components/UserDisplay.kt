package com.example.layoutmigration

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutmigration.model.User

@Composable
fun UserDisplay(user: User){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "user image"
        )

        Text(
            text = user.name,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(text = user.occupation)
    }
}


@Preview
@Composable
fun UserDisplayPreview(user: User = UserDataSource().userData()){
    UserDisplay(user)
}