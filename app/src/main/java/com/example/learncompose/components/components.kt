package com.example.learncompose.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.LockClock
import androidx.compose.material.icons.filled.Timer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.learncompose.model.Course
import com.example.learncompose.model.getCourse
import com.example.learncompose.ui.theme.LearnComposeTheme
import com.example.learncompose.ui.theme.Purple200
import com.example.learncompose.ui.theme.Purple500
import com.example.learncompose.utils.GRADIENT_COLORS
import com.example.learncompose.utils.drawAfter





@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun CourseRow(
    course: Course = getCourse()[0],
    onItemClick: (String) -> Unit = {}
) {
    LearnComposeTheme() {
        Card(modifier = Modifier
            .clickable {
                onItemClick(course.id)
            }) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .height(140.dp),
                    painter = rememberImagePainter(data = course.cover),
                    contentDescription = "Course Image",
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .weight(2f),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
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

                    Text(text = course.description)

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Timer,
                            contentDescription = "Date",
                            modifier = Modifier.size(10.dp)
                        )
                        Text(
                            text = course.duration + "h",
                            style = MaterialTheme.typography.body2
                        )
                    }

                }
            }
        }
    }

}
