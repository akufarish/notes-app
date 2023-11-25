package com.example.notes.controller

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notes.Screen.Screen
import com.example.notes.views.Home
import com.example.notes.views.Tachi

@Composable
fun Navigate() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.TachiScreen.route
    ) {
        composable(route = Screen.TachiScreen.route) {
            Tachi(navController)
        }
    }
}