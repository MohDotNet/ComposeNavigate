package com.example.composenavigate.shared


// STEP 2
/* Define all your screens that you will be using
 */
sealed class Screens(val route : String){
    object homeScreen : Screens("home")
    object detailScreen : Screens("Detail_Screen")
}
