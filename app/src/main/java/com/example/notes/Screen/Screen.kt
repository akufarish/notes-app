package com.example.notes.Screen

sealed class Screen(val route: String) {
    object  MenuScreen: Screen("mainScreen")
    object DetailScreen: Screen("detailScreen")
    object AddScreen: Screen("addScreen")
    object  TachiScreen: Screen("tachiScreen")
}
