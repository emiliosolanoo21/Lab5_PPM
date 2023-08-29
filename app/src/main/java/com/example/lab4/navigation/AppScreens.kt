package com.example.lab4.navigation

sealed class AppScreens(val route: String){
    object InteractiveMenu: AppScreens("interactive_menu")
    object Emergency: AppScreens("emergency")
    object InfoCampus: AppScreens("info_campus")
    object Profile: AppScreens("profile")
    object Settings: AppScreens("settings")
}
