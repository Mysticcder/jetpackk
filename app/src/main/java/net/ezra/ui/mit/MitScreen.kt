

package net.ezra.ui.mit













import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_VIEWV


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MitScreen(navController: NavHostController) {
    Scaffold(



        content = {



            LazyColumn {


                item {


                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.img_7), contentDescription = "",
                            Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop

                        )



                        Spacer(modifier = Modifier.height(15.dp))


                    }


                    Spacer(modifier = Modifier.height(15.dp))


                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.img_8),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )

                                Column {

                                    Text(
                                        text = "Jumping Jacks",
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,
                                        textAlign = TextAlign.Start)

                                    TimerApp()


                                }



                        }

                            


                        }

                        Spacer(modifier = Modifier.height(15.dp))




                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)

                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Column {


                                    Text(
                                        text = "Abdominal Crunches",
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                        )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x12")

                                }


                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {

                                    Text(
                                        text = "Russian Twist", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,

                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x32")
                                }

                            }
                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row (
                                modifier = Modifier
                                    .padding(10.dp)
                            ){

                                Image(
                                    painter = painterResource(id = R.drawable.img_12),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Planks", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,

                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))

                                    Text(text = "x20")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_9),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Push-Ups",
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,

                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x20")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row (
                                modifier = Modifier
                                    .padding(10.dp)
                            ){


                                Image(
                                    painter = painterResource(id = R.drawable.img_13),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillWidth,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Incline Push-Ups", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,

                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x20")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_11),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Mountain Climber", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                            )
                                    
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row (
                                modifier = Modifier
                                    .padding(10.dp)
                            ){


                                Image(
                                    painter = painterResource(id = R.drawable.img_14),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Side Planks",
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }


                        }


                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_15),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Squats", 
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_16),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Lunges", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {


                                Image(
                                    painter = painterResource(id = R.drawable.img_17),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Burpee", 
                                            color = Color.Black,
                                        fontWeight = FontWeight.W500,


                                            
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }


                        }

                        Spacer(modifier = Modifier.height(15.dp))



                        Card(modifier = Modifier
                            .size(width = 500.dp, height = 98.dp),

                            ) {
                            Row (
                                modifier = Modifier
                                    .padding(10.dp)
                            ){

                                Image(
                                    painter = painterResource(id = R.drawable.img_18),
                                    contentDescription = "Nusa Penida",
                                    contentScale = ContentScale.FillWidth,
                                    modifier = Modifier
                                        .size(100.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Column {


                                    Text(
                                        text = "Tricep Dips", style = TextStyle(
                                            color = Color.Black,
                                            fontWeight = FontWeight.W500,


                                            )
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "x16")
                                }
                            }

                            Row {
                                Button(
                                    onClick = {
                                        navController.navigate(ROUTE_VIEWV) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    },
                                    modifier = Modifier
                                        .padding(vertical = 2.dp)
                                        .fillMaxWidth(),
                                    colors = ButtonDefaults.buttonColors(Color.Blue)
                                ) {
                                    Text("Start", color = Color.Black,fontWeight = FontWeight.W500,)
                                }
                            }


                        }















                    }
                }




         }



    )

}






@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun MitScreenPreviewLight() {
    MitScreen(rememberNavController())

}







@Composable
fun TimerApp() {
    var time by remember { mutableStateOf(0) }
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
        Button(
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
            Text(text = if (isRunning) "Stop" else "Start")
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = {
                time = 0
                isRunning = false
                job?.cancel()
            }
        ) {
            Text(text = "Reset")
        }
    }
}

@Composable
fun TimerDisplay(time: Int) {
    Row(
        modifier = Modifier
            .size(180.dp)

            .background(Color.Transparent),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = formatTime(time),
        )
    }
}

fun formatTime(time: Int): String {
    val seconds = time % 60
    val minutes = (time / 60) % 60
    val hours = time / 3600
    return String.format("%02d:%02d:%02d", hours, minutes, seconds)
}
