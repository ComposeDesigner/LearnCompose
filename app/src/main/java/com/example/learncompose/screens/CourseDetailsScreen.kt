package com.example.learncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.learncompose.model.Course
import com.example.learncompose.model.getCourse
import com.example.learncompose.utils.GRADIENT_COLORS
import com.example.learncompose.utils.drawAfter


@Composable
fun CourseDetailsScreen(navController: NavHostController, courseId: String?) {
    val scrollState = rememberScrollState()
    val course: Course = getCourse().filter { course ->
        course.id == courseId
    }.first()

    Scaffold(modifier = Modifier.padding(top = 40.dp), topBar = {
        TopAppBar(
            modifier = Modifier.height(32.dp),
            backgroundColor = Color.Transparent
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go Back",
                    modifier = Modifier
                        .clickable { navController.popBackStack() }
                        .drawAfter { canvas ->
                            val paint = Paint()
                            paint.blendMode = BlendMode.SrcIn
                            canvas.saveLayer(Rect(Offset.Zero, size), paint)
                            drawRect(Brush.linearGradient(GRADIENT_COLORS))
                            canvas.restore()
                        }
                        .size(24.dp)
                )

                if (scrollState.value > 0) {
                    Text(
                        text = course.title,
                        modifier = Modifier.drawAfter { canvas ->
                            val paint = Paint()
                            paint.blendMode = BlendMode.SrcIn
                            canvas.saveLayer(Rect(Offset.Zero, size), paint)
                            drawRoundRect(Brush.linearGradient(GRADIENT_COLORS))
                            canvas.restore()
                        },
                        style = MaterialTheme.typography.h3
                    )
                }
            }


        }
    }) {
        Column(
            modifier = Modifier
                .padding(horizontal = 40.dp, vertical = 8.dp)
                .verticalScroll(enabled = true, state = scrollState),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = course.title,
                modifier = Modifier.drawAfter { canvas ->
                    val paint = Paint()
                    paint.blendMode = BlendMode.SrcIn
                    canvas.saveLayer(Rect(Offset.Zero, size), paint)
                    drawRect(Brush.linearGradient(GRADIENT_COLORS))
                    canvas.restore()
                },
                style = MaterialTheme.typography.h2
            )
            Text(
                text = course.description
            )
            Image(
                modifier = Modifier.height(320.dp),
                painter = rememberImagePainter(data = course.cover),
                contentDescription = "Cover Image of $course",
                contentScale = ContentScale.Crop

            )
            Text(text = course.details)
        }
    }
}