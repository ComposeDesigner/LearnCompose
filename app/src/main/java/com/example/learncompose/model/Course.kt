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
            details = "In this lesson we will learn how to get basics of layout on code directly." +
                    "\n\nThink of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \n\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. They were mythical creatures from fantasy books like unicorns. This was something that Pete knew in his heart to be true so he was having a difficult time acknowledging that there were actually fire-breathing dragons flying in the sky above him.\n\n" +
                    "Sitting in the sun, away from everyone who had done him harm in the past, he quietly listened to those who roamed by. He felt at peace in the moment, hoping it would last, but knowing the reprieve would soon come to an end. He closed his eyes, the sun beating down on face and he smiled. He smiled for the first time in as long as he could remember."
        ),

        Course(
            id = "2",
            title = "Input in Compose",
            duration = "3",
            description = "Users have things to say. Give them a voice 📣",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_01.png",
            details = "Think of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \\n\\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. "
        ),

        Course(
            id = "3",
            title = "Navigation in Compose",
            duration = "3",
            description = "Click a button and go to another page. Magic ✨",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_02.png",
            details = "In this lesson we will learn how to get basics of layout on code directly." +
                    "\n\nThink of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \n\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. They were mythical creatures from fantasy books like unicorns. This was something that Pete knew in his heart to be true so he was having a difficult time acknowledging that there were actually fire-breathing dragons flying in the sky above him.\n\n" +
                    "Sitting in the sun, away from everyone who had done him harm in the past, he quietly listened to those who roamed by. He felt at peace in the moment, hoping it would last, but knowing the reprieve would soon come to an end. He closed his eyes, the sun beating down on face and he smiled. He smiled for the first time in as long as he could remember."

        ),

        Course(
            id = "6",
            title = "Parsing data in Compose",
            duration = "1",
            description = "Make your designs more realistic with real data ‍💻",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable/compose_05.png",
            details = "In this lesson we will learn how to get basics of layout on code directly." +
                    "\n\nThink of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \n\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. They were mythical creatures from fantasy books like unicorns. This was something that Pete knew in his heart to be true so he was having a difficult time acknowledging that there were actually fire-breathing dragons flying in the sky above him.\n\n" +
                    "Sitting in the sun, away from everyone who had done him harm in the past, he quietly listened to those who roamed by. He felt at peace in the moment, hoping it would last, but knowing the reprieve would soon come to an end. He closed his eyes, the sun beating down on face and he smiled. He smiled for the first time in as long as he could remember."

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
            details = "In this lesson we will learn how to get basics of layout on code directly." +
                    "\n\nThink of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \n\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. They were mythical creatures from fantasy books like unicorns. This was something that Pete knew in his heart to be true so he was having a difficult time acknowledging that there were actually fire-breathing dragons flying in the sky above him.\n\n" +
                    "Sitting in the sun, away from everyone who had done him harm in the past, he quietly listened to those who roamed by. He felt at peace in the moment, hoping it would last, but knowing the reprieve would soon come to an end. He closed his eyes, the sun beating down on face and he smiled. He smiled for the first time in as long as he could remember."

        ),

        Course(
            id = "4",
            title = "Images",
            duration = "2",
            description = "Build a gallery of images of your favorite photographer from the internet 📸",
            cover = "https://raw.githubusercontent.com/ComposeDesigner/LearnCompose/master/app/src/main/res/drawable-v24/compose_00.png",
            details = "In this lesson we will learn how to get basics of layout on code directly." +
                    "\n\nThink of all the alignment, constraints, and dimension attributes on Figma. \n\nTranslating them to code is what we will work on.The clowns had taken over. And yes, they were literally clowns. \n\nOver 100 had appeared out of a small VW bug that had been driven up to the bank. Now they were all inside and had taken it over.\n\n" +
                    "There weren't supposed to be dragons flying in the sky. First and foremost, dragons didn't exist. They were mythical creatures from fantasy books like unicorns. This was something that Pete knew in his heart to be true so he was having a difficult time acknowledging that there were actually fire-breathing dragons flying in the sky above him.\n\n" +
                    "Sitting in the sun, away from everyone who had done him harm in the past, he quietly listened to those who roamed by. He felt at peace in the moment, hoping it would last, but knowing the reprieve would soon come to an end. He closed his eyes, the sun beating down on face and he smiled. He smiled for the first time in as long as he could remember."

        )


    )
}
