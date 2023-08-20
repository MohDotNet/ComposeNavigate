package com.example.composenavigate.shared
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import androidx.navigation.compose.rememberNavController
import com.example.composenavigate.screens.DetailScreen
import com.example.composenavigate.screens.HomeScreen


// STEP 3
// CREATE THE NAVIGATION COMPOSABLE, AND DEFINE YOUR ROUTES.
// THIS WIRES IT UP TO THE ACTUAL SCREEN
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination  = Screens.homeScreen.route){
        composable(route =  Screens.homeScreen.route){
                HomeScreen(navController = navController)
        }
        composable(route = Screens.detailScreen.route){
            DetailScreen()

        }
    }
}