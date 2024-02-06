package com.example.animated_dropdown

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.estimateAnimationDurationMillis
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animated_dropdown.ui.theme.Animated_DropDownTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color=Color(0xFF101010), modifier = Modifier.fillMaxSize())
            {
                DropDown(text = "Hello There", modifier =Modifier.padding(15.dp) )
                {
                    Text(text = "This is now revealed !",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(Color.Green), fontSize = 25.sp
                    )

                }

            }

        }
    }
}
@Composable
fun DropDown(text:String,
             modifier: Modifier=Modifier,
             initiallyOpen:Boolean=false,
             content:@Composable () -> Unit)
{
    var isOpen by remember{ mutableStateOf(initiallyOpen) }
    val alpha = animateFloatAsState(
        targetValue = if(isOpen)1f else 0f,
        animationSpec = tween(durationMillis = 300), label = ""
    )
    val RotateX = animateFloatAsState(
        targetValue = if(isOpen)0f else -90f,
        /* here 0 represent no rotation  where as
        -90f represents a 90 degree clockwise around the x axis*/
        animationSpec = tween(durationMillis = 300), label = ""
    )
    Column(modifier=Modifier.fillMaxWidth()) {

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier=Modifier
                .fillMaxWidth())
        {
            Text(text =text,
                color= Color.White, 
                fontSize = 26.sp)
            
            Icon(imageVector= Icons.Default.ArrowDropDown,
                contentDescription = null,
                tint=Color.White,
                modifier = Modifier
                    .clickable { isOpen = !isOpen }
                    .scale(1f, if (isOpen) -1f else 1f)
            )
        }
        Spacer(modifier = Modifier.height(10.dp) )

        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    transformOrigin = TransformOrigin(0.5f, 0f)
                    rotationX = RotateX.value
                }
                .alpha(alpha.value)
        )
        {
            content()

        }
    }
}

