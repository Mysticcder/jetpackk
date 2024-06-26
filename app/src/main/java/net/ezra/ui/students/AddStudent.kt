package net.ezra.ui.students





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
//               AddStudents(video = video)
//            }
//        }
//    }
//}
//
//@Composable
//fun AddStudents(video: Video) {
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