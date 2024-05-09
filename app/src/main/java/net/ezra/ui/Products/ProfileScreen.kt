package net.ezra.ui.Products

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_PROFILE


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Row() {

                    }
                },

                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon",
                            tint = Color.Black)








                    }

                }

                ,

                actions = {

                },

                backgroundColor = Color.Transparent





            )
        },

        content = {

            Box(
                Modifier.fillMaxSize()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }

            Column (
                Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {

                Spacer(modifier = Modifier.height(50.dp))

                Column (
                    Modifier.fillMaxWidth()
                ) {

                    Row (
                        Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Person, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Profile",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                                    }
                                })

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Row (
                        Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.AccountCircle, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Privacy",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {

                                }) }
                    Spacer(modifier = Modifier.height(20.dp))

                    Row (Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Person, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Security",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {

                                })

                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row (Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Person, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Saved",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {

                                })

                    }









                }

            }

        }

    )



















}


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProfileScreen(rememberNavController())
}

