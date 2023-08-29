package com.estudiomil.dicodingbeginnersubmission.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.estudiomil.dicodingbeginnersubmission.model.DetailViewModel
import com.estudiomil.dicodingbeginnersubmission.ui.screen.AboutScreen
import com.estudiomil.dicodingbeginnersubmission.ui.screen.DetailScreen
import com.estudiomil.dicodingbeginnersubmission.ui.screen.HomeScreen
import com.estudiomil.dicodingbeginnersubmission.ui.screen.SplashScreen

sealed class Screens(val route: String) {

    object SplashScreen : Screens("splash")
    object HomeScreen : Screens("home")
    object DetailScreen : Screens("detail")
    object AboutScreen : Screens("about")
}

class ArticleApp{

    @Composable
    fun Route(
        detailViewModel: DetailViewModel
    ) {

        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = Screens.SplashScreen.route)
        {
            composable(Screens.SplashScreen.route) {
                SplashScreen(navController)
            }
            composable(Screens.HomeScreen.route) {
                HomeScreen(navController, detailViewModel)
            }
            composable(Screens.DetailScreen.route) {
                DetailScreen(detailViewModel ,navController = navController,)
            }
            composable(Screens.AboutScreen.route) {
                AboutScreen(navController)
            }
        }
    }

    fun push(navController: NavHostController, screen: String) {
        navController.navigate(screen)
    }

    fun pushAndReplace(navController: NavHostController, screen: String) {
        navController.navigate(screen) {
            popUpTo(navController.graph.id) {
                inclusive = true
            }
        }
    }

    fun pop(navController: NavHostController) {
        navController.popBackStack()
    }
}