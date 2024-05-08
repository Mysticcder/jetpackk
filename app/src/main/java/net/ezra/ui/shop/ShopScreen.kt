package net.ezra.ui.shop


import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun ShopScreen(navController: NavHostController) {
//    Box {
//        Column(
//            modifier = Modifier.fillMaxHeight(),
//            verticalArrangement = Arrangement.SpaceBetween
//        ) {
//
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .verticalScroll(rememberScrollState())
//                    .weight(5f, false),
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.img_7), contentDescription = "",
//                    Modifier.fillMaxSize(),
//                    contentScale = ContentScale.Crop
//
//                )
//
//
//
//                Spacer(modifier = Modifier.height(15.dp))
//
//
//            }
//
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//            Card(modifier = Modifier
//                .clickable { }
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_8),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//
//                    Column {
//
//                        Text(
//                            text = "Jumping Jacks",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//                            textAlign = TextAlign.Start)
//
//                        TimerApp()
//
//
//                    }
//
//
//
//                }
//
//
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//
//                ) {
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_9),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//                    Column {
//
//
//                        Text(
//                            text = "Abdominal Crunches",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x12")
//
//                    }
//
//
//                }
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_9),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//                        Text(
//                            text = "Russian Twist",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x32")
//                    }
//
//                }
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row (
//                    modifier = Modifier
//                        .padding(10.dp)
//                ){
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_12),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Planks",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//
//                        Text(text = "x20")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_9),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Push-Ups",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x20")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row (
//                    modifier = Modifier
//                        .padding(10.dp)
//                ){
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_13),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillWidth,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Incline Push-Ups",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x20")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_11),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Mountain Climber",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//                            )
//
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row (
//                    modifier = Modifier
//                        .padding(10.dp)
//                ){
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_14),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Side Planks",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//
//
//            }
//
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_15),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Squats",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_16),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Lunges",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row(
//                    modifier = Modifier
//                        .padding(10.dp)
//                ) {
//
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_17),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Burpee",
//                            color = Color.Black,
//                            fontWeight = FontWeight.W500,
//
//
//
//                            )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//
//            Card(modifier = Modifier
//                .size(width = 500.dp, height = 98.dp),
//
//                ) {
//                Row (
//                    modifier = Modifier
//                        .padding(10.dp)
//                ){
//
//                    Image(
//                        painter = painterResource(id = R.drawable.img_18),
//                        contentDescription = "Nusa Penida",
//                        contentScale = ContentScale.FillWidth,
//                        modifier = Modifier
//                            .size(100.dp),
//                    )
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Column {
//
//
//                        Text(
//                            text = "Tricep Dips", style = TextStyle(
//                                color = Color.Black,
//                                fontWeight = FontWeight.W500,
//
//
//                                )
//                        )
//                        Spacer(modifier = Modifier.height(6.dp))
//                        Text(text = "x16")
//                    }
//                }
//            }
//
//
//
//                Button(
//                    onClick = {
//                        navController.navigate(ROUTE_SERVICES) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                    modifier = Modifier
//                        .padding(vertical = 2.dp)
//                        .fillMaxWidth()
//                        .align(alignment = Alignment.CenterHorizontally),
//                    colors = ButtonDefaults.buttonColors(Color.Yellow)
//                ) {
//                    Text("Get Started", color = Color.Black)
//                }
//            }
//
//
//        }
   }
//
//
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}
//
//
//@Composable
//fun TimerApp() {
//    var time by remember { mutableStateOf(0) }
//    var isRunning by remember { mutableStateOf(false) }
//    var job by remember { mutableStateOf<Job?>(null) }
//
//    Column(
//        modifier = Modifier
//            .padding(6.dp),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.End
//    ) {
//        TimerDisplay(time)
//        Spacer(modifier = Modifier.height(6.dp))
//        Button(
//            modifier = Modifier.background(color = Color.Transparent),
//            onClick = {
//                isRunning = !isRunning
//                if (isRunning) {
//                    job = CoroutineScope(Dispatchers.Main).launch {
//                        while (isActive) {
//                            delay(1000)
//                            time++
//                        }
//                    }
//                } else {
//                    job?.cancel()
//                }
//            }
//        ) {
//            Text(text = if (isRunning) "Stop" else "Start")
//        }
//        Spacer(modifier = Modifier.height(6.dp))
//        Button(
//            onClick = {
//                time = 0
//                isRunning = false
//                job?.cancel()
//            }
//        ) {
//            Text(text = "Reset")
//        }
//    }
//}
//
//@Composable
//fun TimerDisplay(time: Int) {
//    Row(
//        modifier = Modifier
//            .size(180.dp)
//
//            .background(Color.Transparent),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(
//            text = formatTime(time),
//        )
//    }
//}
//
//fun formatTime(time: Int): String {
//    val seconds = time % 60
//    val minutes = (time / 60) % 60
//    return String.format("%02d:%02d", minutes, seconds)
//}
