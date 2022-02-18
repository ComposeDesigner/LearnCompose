package com.example.learncompose.ui.theme

import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.learncompose.R

private val opensans_regular = FontFamily(Font(R.font.opensansregular))

private val opensans_medium = FontFamily(Font(R.font.opensansmedium))

private val opensans_semibold = FontFamily(Font(R.font.opensanssemibold))

private val opensans_bold = FontFamily(Font(R.font.opensansbold))

val Typography = Typography(

    body1 = TextStyle(
        fontFamily = opensans_semibold,
        fontSize = 16.sp
    ),

    h2 = TextStyle(
        fontFamily = opensans_bold,
        fontSize = 24.sp
    ),

    h3 = TextStyle(
        fontFamily = opensans_bold,
        fontSize = 20.sp
    ),

    body2 = TextStyle(
        fontFamily = opensans_regular,
        fontSize = 10.sp
    ),

    h1 = TextStyle(
        fontFamily = opensans_bold,
        fontSize = 32.sp
    )
)