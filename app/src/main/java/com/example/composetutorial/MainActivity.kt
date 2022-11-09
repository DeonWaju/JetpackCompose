package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }

}

@Composable
fun Greeting(name: String) {

    Row(
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight(0.2f)
            .background(Color.Blue)
            .border(BorderStroke(2.dp, color = Color.Black))
    ) {
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
        Text(text = "World $name!")

    }
    Column(
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight(0.7f)
            .background(Color.Blue)
            .border(BorderStroke(2.dp, color = Color.Black))
    ) {
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
        Text(text = "World $name!")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Dami")
}