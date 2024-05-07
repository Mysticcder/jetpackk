//package net.ezra.ui.VIDEOS
//
//
//import android.annotation.SuppressLint
//import android.widget.VideoView
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.viewinterop.AndroidView
//import androidx.core.net.toUri
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.tasks.await
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun VideoListScreen(navController: NavController) {
//    var videos by remember { mutableStateOf<List<Video>>(emptyList()) }
//    val scaffoldState = rememberScaffoldState()
//    val coroutineScope = rememberCoroutineScope()
//
//    LaunchedEffect(Unit) {
//        fetchVideosFromFirestore()?.let { fetchedVideos ->
//            videos = fetchedVideos
//        } ?: run {
//            coroutineScope.launch {
//                scaffoldState.snackbarHostState.showSnackbar("Failed to fetch videos from Firestore.")
//            }
//        }
//    }
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Video List") },
//                backgroundColor = Color.White,
//                elevation = AppBarDefaults.TopAppBarElevation
//            )
//        },
//        backgroundColor = Color.White
//    ) {
//        VideoListContent(videos = videos)
//    }
//}
//
//@Composable
//fun VideoListContent(videos: List<Video>) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//        LazyColumn(modifier = Modifier.fillMaxSize().background(Color.White)) {
//            items(videos) { video ->
//                VideoListItem(video = video)
//            }
//        }
//    }
//}
//
//@Composable
//fun VideoListItem(video: Video) {
//    val context = LocalContext.current
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//
//
//    ) {
//        AndroidView(
//            factory = { context ->
//                val videoView = VideoView(context).apply {
//                    setVideoURI(video.url.toUri()) // Assuming url is the URI of the video
//                    start() // Auto-start the video
//                }
//                videoView
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp) // Adjust height as needed
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = video.title,
//            modifier = Modifier.padding(horizontal = 16.dp),
//            color = Color.Red
//        )
//
//        Text(
//            text = video.description,
//            modifier = Modifier.padding(horizontal = 16.dp)
//        )
//    }
//}
//
//data class Video(val title: String, val description: String, val url: String)
//
//suspend fun fetchVideosFromFirestore(): List<Video>? {
//    return try {
//        val firestore = Firebase.firestore
//        val videosCollection = firestore.collection("videos").get().await()
//
//        val videoList = mutableListOf<Video>()
//        for (document in videosCollection.documents) {
//            val title = document.getString("title") ?: ""
//            val description = document.getString("description") ?: ""
//            val url = document.getString("url") ?: ""
//            videoList.add(Video(title, description, url))
//        }
//        videoList
//    } catch (e: Exception) {
//        // Handle exceptions
//        null
//    }
//}