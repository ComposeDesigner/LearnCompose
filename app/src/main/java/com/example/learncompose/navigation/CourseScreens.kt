package com.example.learncompose.navigation

import java.lang.IllegalArgumentException


enum class CourseScreens {
    CourseListScreen,
    CourseDetailsScreen;

    companion object {
        fun fromRoute(route: String?): CourseScreens =
            when (route?.substringBefore("/")) {
                CourseListScreen.name -> CourseListScreen
                CourseDetailsScreen.name -> CourseDetailsScreen
                null -> CourseListScreen
                else -> throw IllegalArgumentException("Invalid route $route specified")

            }
    }
}




