
#  DropDown  **Compose**

This composable function implements a customizable DropDown menu in Jetpack Compose with smooth animation.
## Demo



![Drop_Down-gif](https://github.com/Kota-Kun22/Animated_DropDown/assets/68362699/a2ecf986-4f1a-42ef-9097-6b1cbe2b11fa)


## Tech Stack

**Language:** Kotlin ..supremacy

**Design :** JetPackCompose

**library:** 

androidx.compose.material3: A Material Design 3 library for Compose UI elements


**Dependencies ::**

implementation("androidx.core:core-ktx:1.9.0")

implementation("androidx.compose.ui:ui")

implementation(platform("androidx.compose:compose-bom:2023.03.00"))


**Plugins ::**

id("com.android.application")

id("org.jetbrains.kotlin.android")





## Lessons Learned

What did I learn while building this project? What challenges did I face ?

**Drop Down  App Learnings :**

I have learned about ***animateFloatAsState***

**...**  Imagine you're controlling a light switch. Flipping it instantly changes the light state, but wouldn't it be cooler if the light smoothly dimmed or brightened? That's what animateFloatAsState does in Compose!

![image](https://github.com/Kota-Kun22/Animated_DropDown/assets/68362699/a5d55e61-3583-43fa-9396-623a75f6cef0)


***Understanding 0f and -90f : ***

0f : Represents no rotation (flat).

-90f : Represents a 90-degree rotation clockwise around the X-axis.

![image](https://github.com/Kota-Kun22/Animated_DropDown/assets/68362699/9681b8c8-653b-4ce1-a25f-e30214277659)

## Pull Requests

Fork the repository and create a new branch for your feature or bug fix:

git checkout -b  feature-name Make your changes and commit them :

git commit -m  "Description of changes" Push your changes to your fork :

git push origin feature-name Open a pull request to the main branch of the original repository.
## Key Take-Down..

Get smooth animations rolling with **animateFloatAsState** in Compose!

***Key perks:***

Easy peasy to use (even beginners can rock it )
Built-in animation styles for cool effects (think tweening like a magician 🪄 or springy transitions like a bouncy ball )
Super efficient rendering thanks to Compose's magic ✨
Remember:

Use it for numbers that like to move (opacity, rotation, scale, you get the idea )
Mix it with other modifiers for super cool animation combos


***Experiment and have fun! Your Compose UIs will thank you***