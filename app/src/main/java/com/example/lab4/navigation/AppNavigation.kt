package com.example.lab4.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab4.InteractiveMenu
import com.example.lab4.Emergency
import com.example.lab4.InfoCampus
import com.example.lab4.Profile
import com.example.lab4.Settings

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.InteractiveMenu.route){
        composable(route = AppScreens.InteractiveMenu.route){
            InteractiveMenu(navController)
        }
        composable(route = AppScreens.Emergency.route){
            Emergency(navController)
        }
        composable(route = AppScreens.InfoCampus.route){
            InfoCampus(navController)
        }
        composable(route = AppScreens.Profile.route){
            Profile(navController)
        }
        composable(route = AppScreens.Settings.route){
            Settings(navController)
        }
    }
}

