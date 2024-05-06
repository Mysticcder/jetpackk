//import android.annotation.SuppressLint
//import android.net.Uri
//import android.widget.Toast
//import androidx.activity.compose.rememberLauncherForActivityResult
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase
//import com.google.firebase.storage.FirebaseStorage
//import com.google.firebase.storage.ktx.storage
//import java.util.*
//
//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//@Composable
//fun ContactScreen(navController: NavHostController) {
//    var selectedVideoUri by remember { mutableStateOf<Uri?>(null) }
//    var titleText by remember { mutableStateOf(TextFieldValue()) }
//    var descriptionText by remember { mutableStateOf(TextFieldValue()) }
//    var uploading by remember { mutableStateOf(false) }
//    val context = LocalContext.current
//    val storage = Firebase.storage
//
//    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
//        selectedVideoUri = uri
//    }
//
//    val scaffoldState = rememberScaffoldState()
//
//    Scaffold(
//        scaffoldState = scaffoldState,
//        content = {
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Button(
//                    onClick = { launcher.launch("video/*") },
//                    modifier = Modifier.padding(16.dp)
//                ) {
//                    Text("Select Video")
//                }
//
//                selectedVideoUri?.let {
//                    Spacer(modifier = Modifier.height(16.dp))
//                    TextField(
//                        value = titleText,
//                        onValueChange = { titleText = it },
//                        label = { Text("Title") },
//                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    TextField(
//                        value = descriptionText,
//                        onValueChange = { descriptionText = it },
//                        label = { Text("Description") },
//                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(
//                        onClick = {
//                            uploading = true
//                            uploadVideoToFirebase(storage, it, titleText.text, descriptionText.text) {
//                                uploading = false
//                                Toast.makeText(context, "Video uploaded successfully", Toast.LENGTH_SHORT).show()
//                                // Clear text fields and video selection
//                                titleText = TextFieldValue("")
//                                descriptionText = TextFieldValue("")
//                                selectedVideoUri = null
//                            }
//                        },
//                        modifier = Modifier.padding(16.dp)
//                    ) {
//                        Text("Upload Video")
//                    }
//
//                }
//            }
//        },
//        bottomBar = {
//            if (uploading) {
//                LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
//            }
//        }
//    )
//}
//
//fun uploadVideoToFirebase(
//    storage: FirebaseStorage,
//    videoUri: Uri,
//    title: String,
//    description: String,
//    onComplete: () -> Unit
//) {
//    val storageRef = storage.reference.child("videos/${UUID.randomUUID()}")
//    val firestore = Firebase.firestore
//
//    storageRef.putFile(videoUri)
//        .addOnSuccessListener { taskSnapshot ->
//            taskSnapshot.storage.downloadUrl.addOnSuccessListener { downloadUri ->
//                val videoData = hashMapOf(
//                    "title" to title,
//                    "description" to description,
//                    "url" to downloadUri.toString()
//                )
//
//                firestore.collection("videos")
//                    .add(videoData)
//                    .addOnSuccessListener { documentReference ->
//                        onComplete()
//                    }
//                    .addOnFailureListener { e ->
//                        println("Error uploading video: $e")
//                    }
//            }
//        }
//        .addOnFailureListener { exception ->
//            println("Error uploading video: $exception")
//        }
//}
//
//
//@Preview
//@Composable
//fun PreviewVideoUploadScreen() {
//   ContactScreen(rememberNavController())
//}
//
