package com.example.learncompose.model

data class Course(
    val id: String,
    val title: String,
    val duration: String,
    val cover: String,
    val description: String,
    val details: String,
)

fun getCourse(): List<Course> {
    return listOf(

        Course(
            id = "1",
            title = "Designing with Jetpack Compose",
            duration = "2",
            description = "Draw boxes, rectangles, and auto layout them on code directly 🎁",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_04.png",
            details = ""
        ),

        Course(
            id = "2",
            title = "Input in Compose",
            duration = "3",
            description = "Users have things to say. Give them a voice 📣",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_01.png",
            details = ""
        ),

        Course(
            id = "3",
            title = "Navigation in Compose",
            duration = "3",
            description = "Click a button and go to another page. Magic ✨",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_02.png",
            details = ""
        ),

        Course(
            id = "6",
            title = "Parsing data in Compose",
            duration = "1",
            description = "Make your designs more realistic with real data ‍💻",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_05.png",
            details = ""
        ),

        Course(
            id = "4",
            title = "Images",
            duration = "2",
            description = "Build a gallery of images of your favorite photographer from the internet 📸",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_00.png",
            details = ""
        ),

        Course(
            id = "5",
            title = "Compose Canvas",
            duration = "5",
            description = "PNGs are yesteryear. Draw logos on the canvas using shapes, paths, and a little math 🎨",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_03.png",
            details = ""
        ),

        Course(
            id = "4",
            title = "Images",
            duration = "2",
            description = "Build a gallery of images of your favorite photographer from the internet 📸",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_00.png",
            details = ""
        )


    )
}
