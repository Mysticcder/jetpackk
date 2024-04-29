package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.dp
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "",
                        modifier = Modifier
                            .background(Color.Black)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUTE_SERVICES){
                        popUpTo(ROUTE_HOME){inclusive = true}
                    } }) {
                        Icon(Icons.Filled.Menu, "StartUp")
                    }
                },

            )
        }, content = {


                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()

                    ) {
                        item {


                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .fillMaxSize()
                                )

                            }

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Button(onClick = {
                                    navController.navigate(ROUTE_SERVICES) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }

                                }) {

                                    Image(
                                        imageVector = Icons.Default.PlayArrow,
                                        contentDescription = "play button icon",
                                        modifier = Modifier.size(20.dp)
                                    )

                                    Text(text = "Get Started", Modifier.padding(start = 10.dp))

                                }

                            }




                        }
                    }








        }


    )


















    }
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

