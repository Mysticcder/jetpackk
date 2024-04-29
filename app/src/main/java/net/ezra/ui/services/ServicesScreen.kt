package net.ezra.ui.services


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ServicesScreen(navController: NavHostController) {
    Scaffold(

        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(6.dp)
            ) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Spacer(modifier = Modifier.width(100.dp))

                        Row(
                            modifier = Modifier
                                .background(Color.White),
//                    verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {
                            Image(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = ""
                            )
                        }



                        Column(
                            modifier = Modifier
//                                .size(width = 450.dp, height = 150.dp)
                        ) {
                            Card(modifier = Modifier
                                .background(Color.DarkGray)
                                .size(width = 500.dp, height = 98.dp),
                                onClick = {
                                navController.navigate(ROUTE_ABOUT) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            }) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_3),
                                    contentDescription = "Nusa Penida",
                                    modifier = Modifier
                                        .size(50.dp),
                                )
                                Text(text = "Running 7 days", textAlign = TextAlign.Justify, color = Color.White)


                            }
                        }

                        Spacer(modifier = Modifier.height(120.dp))

                        Row(
                            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Text(text = "Workout Program", color = Color.White, textAlign = TextAlign.Left)

                            Text(text = "See All", color = Color.Green, textAlign = TextAlign.End)
                        }

                        Spacer(modifier = Modifier.height(10.dp))


                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .fillMaxSize()
                                .horizontalScroll(state = ScrollState(2))

                        ) {

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color(0xffebdd19)),
                                border = BorderStroke(1.5.dp, Color.Transparent),
                                contentPadding = PaddingValues(15.dp),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)
                            ) {
                                Text("All Types", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color(0xff232321)),
                                border = BorderStroke(1.5.dp, Color.Transparent),
                                contentPadding = PaddingValues(15.dp),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)

                            ) {
                                Text("Strength", color = Color.White)
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color(0xff232321)),
                                border = BorderStroke(1.5.dp, Color.Transparent),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)
                            ) {

                                Text("Chest", color = Color.White)
                            }

                            Spacer(modifier = Modifier.width(20.dp))

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color(0xff232321)),
                                border = BorderStroke(1.5.dp, Color.Transparent),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)
                            ) {
                                Text("Arm", color = Color.White)
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.outlinedButtonColors(Color(0xff232321)),
                                border = BorderStroke(1.5.dp, Color.Transparent),
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)
                            ) {
                                Text("More", color = Color.White)
                            }

                        }

                        Spacer(modifier = Modifier.height(20.dp))


                    }


                    Spacer(modifier = Modifier.width(20.dp))

                    Row(
                        modifier = Modifier
                            .size(width = 720.dp, height = 290.dp)
                            .horizontalScroll(state = ScrollState(2))

                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 6.dp)
                                .wrapContentHeight(align = Alignment.Top),
                            shape = RoundedCornerShape(15.dp)

                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {

                                Image(painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.matchParentSize())
                                Row (
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.Bottom
                                ){
                                    Text(text = "Full Body Workout", color = Color.White,
                                        fontSize = 25.sp)
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "24 Task", color = Color.White
                                    )

                                }

                            }

                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 6.dp)
                                .wrapContentHeight(align = Alignment.Top),
                            shape = RoundedCornerShape(15.dp)

                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {

                                Image(painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.matchParentSize())
                                Row (
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.Bottom
                                ){
                                    Text(text = "Full Body Workout", color = Color.White,
                                        fontSize = 25.sp)
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(text = "24 Task", color = Color.White
                                    )

                                }

                            }

                        }
                    }
                }
            }

        },
        bottomBar = { BottomBar() }
    )
}






@Composable
fun BottomBar() {

    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}









@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

