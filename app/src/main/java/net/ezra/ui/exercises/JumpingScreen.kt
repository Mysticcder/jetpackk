package net.ezra.ui.exercises

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

@Composable
fun JumpingJackScreen(navController: NavHostController) {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var jumpCount by remember { mutableStateOf(0) }

            Text(
                text = "Jumping Jacks",
                style = MaterialTheme.typography.h4
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Jump count: $jumpCount",
                style = MaterialTheme.typography.body1
            )

            Spacer(modifier = Modifier.height(16.dp))

            JumpingJackButton(onJump = { jumpCount++ })
        }
    }
}

@Composable
fun JumpingJackButton(
    onJump: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(8.dp),
    elevation: ButtonElevation? = ButtonDefaults.elevation(defaultElevation = 4.dp),
) {
    Button(
        onClick = { onJump() },
        modifier = modifier.background(Color.Blue, shape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Blue,
            contentColor = Color.White
        ),
        shape = shape,
        elevation = elevation,
        contentPadding = PaddingValues(16.dp)
    ) {
        Text(text = "Jump!")
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewLight() {
    JumpingJackScreen(rememberNavController())

}





@Composable
fun TimerApp() {
    var time by remember { mutableStateOf(20) }
    var isRunning by remember { mutableStateOf(false) }
    var job by remember { mutableStateOf<Job?>(null) }

    Column(
        modifier = Modifier
            .padding(6.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        TimerDisplay(time)
        Spacer(modifier = Modifier.height(6.dp))
        androidx.compose.material3.Button(
            modifier = Modifier.background(color = Color.Transparent),
            onClick = {
                isRunning = !isRunning
                if (isRunning) {
                    job = CoroutineScope(Dispatchers.Main).launch {
                        while (isActive) {
                            delay(1000)
                            time++
                        }
                    }
                } else {
                    job?.cancel()
                }
            }
        ) {
            androidx.compose.material3.Text(text = if (isRunning) "Stop" else "Start")
        }
        Spacer(modifier = Modifier.height(6.dp))
        androidx.compose.material3.Button(
            onClick = {
                time = 0
                isRunning = false
                job?.cancel()
            }
        ) {
            androidx.compose.material3.Text(text = "Reset")
        }
    }
}

@Composable
fun TimerDisplay(time: Int) {
    Row(
        modifier = Modifier
            .size(50.dp)

            .background(Color.Transparent),
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Text(
            text = formatTime(time),
        )
    }
}

fun formatTime(time: Int): String {
    val seconds = time % 60
    val minutes = (time / 60) % 60
    return String.format("%02d:%02d", minutes, seconds)
}