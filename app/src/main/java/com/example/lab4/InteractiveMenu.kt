package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.lab4.navigation.AppNavigation
import com.example.lab4.navigation.AppScreens
import com.example.lab4.ui.theme.Lab4Theme

class InteractiveMenu(navController: NavController) : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun Buttons(navController: NavController) {
    Surface {
        Column {
            BEmergency(navController)
            BInfoCampus(navController)
            BProfile(navController)
            BSettings(navController)
        }
    }
}

@Composable
fun BEmergency(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(route = AppScreens.Emergency.route) },
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Emergencia", color = Color.White)
        }
    }
}

@Composable
fun BInfoCampus(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(route = AppScreens.InfoCampus.route) },
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Conoce tu campus", color = Color.White)
        }
    }
}

@Composable
fun BProfile(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(route = AppScreens.Profile.route) },
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Perfil", color = Color.White)
        }
    }
}

@Composable
fun BSettings(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(route = AppScreens.Settings.route) },
            modifier = Modifier
                .padding(16.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Ajustes", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMenu() {
    Lab4Theme {
        AppNavigation()
    }
}
