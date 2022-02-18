package com.example.learncompose.utils

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import com.example.learncompose.ui.theme.Purple200
import com.example.learncompose.ui.theme.Purple500


private val PAINT: Paint = Paint()

val GRADIENT_COLORS = listOf(
    Purple200, Purple500
)


fun Modifier.drawAfter(block: ContentDrawScope.(Canvas) -> Unit = {}): Modifier =
    drawWithContent {
        drawIntoCanvas { canvas ->
            canvas.saveLayer(Rect(Offset.Zero, size), PAINT)
            drawContent()
            block(canvas)
            canvas.restore()
        }
    }