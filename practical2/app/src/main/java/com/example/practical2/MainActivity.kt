package com.example.practical2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practical2.ui.theme.Practical2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practical2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Sujair",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(20.dp),
        fontSize = 50.sp
    )
    Text(
        text = "Welcome $name!",
        modifier = modifier.padding(80.dp),
        fontSize = 50.sp
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practical2Theme {
        Greeting("Sujair")

    }

}

@Composable
fun Hello() {
    Text(

        text = "Hello I am Sujair",

    )
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    Text(
        text = "Hello I am Sujair",
        color = Color.Red,

    )

}