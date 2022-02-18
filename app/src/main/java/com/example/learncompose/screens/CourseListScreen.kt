package com.example.learncompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.learncompose.components.CourseRow
import com.example.learncompose.model.Course
import com.example.learncompose.model.getCourse
import com.example.learncompose.navigation.CourseScreens


@Composable
fun CourseListScreen(navController: NavHostController) {
    val courseList: List<Course> = getCourse()
    Column(modifier = Modifier.padding(top = 40.dp)) {
        Text(
            text = "Compose",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 16.dp, bottom = 8.dp)
        )
        LazyColumn(contentPadding = PaddingValues(24.dp)) {
            items(items = courseList) { item ->
                CourseRow(item) {
                    course ->
                    navController.navigate(route = CourseScreens.CourseDetailsScreen.name + "/$course")
                }
            }
        }
    }
}