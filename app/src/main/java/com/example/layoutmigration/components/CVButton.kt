package com.example.layoutmigration.components

import android.content.res.Configuration
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun CVButtonPreview(){
    CVButton{}
}