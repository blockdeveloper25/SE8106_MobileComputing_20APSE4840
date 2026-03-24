package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {


            val navController = rememberNavController()

            NavHost(navController, startDestination = "login") {
                composable("login") {
                    LoginScreen(
                        onLogin = {
                            navController.navigate("home") {
                                popUpTo("login") {
                                    inclusive = true
                                }
                            }
                        },
                        onRegisterClick = {
                            navController.navigate("register") {}
                        }

                    )
                }
                composable("register") {
                    RegisterScreen(
                        onComplete= { navController.popBackStack()}
                    )
                }
                composable("home") {
                    HomeScreen()
                }
            }
        }
    }

    @Composable
    fun LoginScreen(
        onLogin: () -> Unit,
        onRegisterClick: () -> Unit
    ) {
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        Column() {
            Text(
                text = "Login",
                modifier = Modifier.padding(top = 50.dp)
            )
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") }
            )

            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") }
            )
            TextButton(onClick = onLogin) {
                Text("Login")
            }

            TextButton(onClick = onRegisterClick) {
                Text("Go to Regsiter")
            }
        }
    }

    @Composable
    fun RegisterScreen(onComplete: () -> Unit){

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Column() {
            Text("Register")

            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Name") }
            )

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") }
            )

            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") }
            )

            TextButton(onClick = onComplete) {
                Text("Register")
            }
        }
    }
    @Composable
    fun HomeScreen(){
        Box(){
            Text("logged In")
        }
    }
}


