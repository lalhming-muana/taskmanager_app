package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.task_manager.ui.theme.Task_managerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_managerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SetUp()
                }
            }
        }
    }
}
@Composable
fun SetUp(){
    TaskManager(
        imagePainter = painterResource(R.drawable.ic_task_completed),
        name = stringResource(R.string.name),
        secondText = stringResource(R.string.second_text),

    )
}

@Composable
fun TaskManager(name: String, imagePainter: Painter, secondText: String,  modifier: Modifier = Modifier) {

  Column(verticalArrangement = Arrangement.Center ,modifier = modifier){

    Image(
         painter = imagePainter,
         contentDescription = null,

    )
    Text(
        text =name,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
    )

    Text(
        text =secondText,
        fontSize = 10.sp,
        textAlign = TextAlign.Justify,
    )

  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task_managerTheme {
        SetUp()
    }
}