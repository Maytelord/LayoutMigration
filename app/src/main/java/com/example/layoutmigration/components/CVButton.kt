package com.example.layoutmigration.components

import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.layoutmigration.R

@Composable
fun CVButton(isError: Boolean = false, onClick : () -> Unit){
    Button(
        onClick = { onClick.invoke() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isError) Color.Red else MaterialTheme.colors.primary
        )
    ) {

        Text(text = stringResource(id = R.string.add_experience))
    }
}