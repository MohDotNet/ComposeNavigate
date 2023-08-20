package com.example.composenavigate.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.composenavigate.shared.Screens
import com.example.composenavigate.shared.mToast

@Composable
fun HomeScreen(navController: NavController) {

    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize())
        {
            Column(
                modifier = Modifier
                    .align(alignment = Alignment.Center)
            )
            {
                Text(text = "Mohanmed Home Screen",
                    modifier = Modifier
                        .clickable {
                            mToast("You Tapped it", context)
                            navController.navigate(Screens.detailScreen.route)
                        })
            }
        }
}




@Preview(showBackground = true)
@Composable
fun Preview(){

}