package com.example.learncompose.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.learncompose.screens.CourseDetailsScreen
import com.example.learncompose.screens.CourseListScreen

@Composable
fun CourseNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = CourseScreens.CourseListScreen.name
    ) {

        composable(CourseScreens.CourseListScreen.name) {
            CourseListScreen(navController = navController)
        }

        composable(
            CourseScreens.CourseDetailsScreen.name + "/{course}",
            arguments = listOf(navArgument(name = "course") {
                type = NavType.StringType
            })
        ) { backstackEntry ->
            CourseDetailsScreen(
                navController = navController,
                backstackEntry.arguments?.getString("course")
            )
        }
    }
}




