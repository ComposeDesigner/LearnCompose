package com.example.learncompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Purple200,
    secondary = Purple500,
    background = Color.Black,
    surface = Color.Black,
    onSurface = Color.White,
    onBackground = Color.White

)

private val LightColorPalette = lightColors(
    primary = Purple200,
    secondary = Purple500,
    background = Color.Black,
    surface = Color.Black,
    onSurface = Color.White,
    onBackground = Color.White
)

@Composable
fun LearnComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}