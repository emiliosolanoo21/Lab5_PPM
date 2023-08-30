package com.example.lab4

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InteractiveMenu()
                }
            }
        }
    }
}

fun Context.findActivity(): ComponentActivity? = when (this) {
    is ComponentActivity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}

@Composable
fun InteractiveMenu() {
    val mContext = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Row (horizontalArrangement = Arrangement.Center)
        {
            Text(text = "UVG+",
                style = TextStyle(color = Color(17, 110, 35), fontSize = 45.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(35.dp))
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, InfoCampus::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(35, 145, 103)),
            modifier = Modifier.width(275.dp).height(100.dp).padding(15.dp)
        )
        {
            Text("Tu Campus", fontSize = 20.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, Profile::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(36, 90, 46)),
            modifier = Modifier.width(275.dp).height(100.dp).padding(15.dp)
        )
        {
            Text("Ir al Perfil", fontSize = 20.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, Settings::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(65, 134, 98)),
            modifier = Modifier.width(275.dp).height(100.dp).padding(15.dp)
        )
        {
            Text("Configuración", fontSize = 20.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, Emergency::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(35, 150, 14)),
            modifier = Modifier.width(275.dp).height(100.dp).padding(15.dp)
        )
        {
            Text("Para Emergencias", fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainMenuPreview() {
    Lab4Theme {
        Surface {
            InteractiveMenu()
        }
    }
}