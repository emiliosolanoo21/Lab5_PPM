package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class Profile: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyProfilePage()
                }
            }
        }
    }
}

@Composable
fun MyProfilePage(){
    Surface {
        Column (modifier = Modifier.verticalScroll(rememberScrollState()))
        {
            ProfileDes()
            Menu()
        }
    }
}

@Composable
fun ProfileDes(){
    val avatar = painterResource(id = R.drawable.perfil_pic)
    val settings = painterResource(id = R.drawable.ajustes)
    val bg = painterResource(id = R.drawable.fondo1_perfil)
    val circle = painterResource(id = R.drawable.circle)

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
             modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "   ")

            Text(
                text = "Mi Perfil",
                 style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                 modifier = Modifier.padding(20.dp)
            )

            Image(
                painter = settings,
                contentDescription = "Settings logo", Modifier.absoluteOffset(0.dp,25.dp)
            )
        }

        Box (
            Modifier
            .fillMaxWidth()
            .height(200.dp)
        )
        {
            Image(
                painter = bg,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .alpha(0.6f)
            )

            Image(
                painter = circle,
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .absoluteOffset(0.dp, 40.dp)
            )

            Image(painter = avatar,
                  contentDescription = null,
                  modifier = Modifier
                      .size(150.dp)
                      .align(Alignment.Center)
                      .absoluteOffset(0.dp, 40.dp))
        }

        Text(text = "EMILIO JOSE SOLANO OROZCO",
            style = TextStyle(
                color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp)
        )
    }
}

@Composable
fun Menu(){
    val calendario = painterResource(id = R.drawable.calendario)
    val horario = painterResource(id = R.drawable.horarios)
    val grupos = painterResource(id = R.drawable.grupos)
    val campus = painterResource(id = R.drawable.campus)
    val notas = painterResource(id = R.drawable.tasks)
    val cursos = painterResource(id = R.drawable.cursos)
    val amigos = painterResource(id = R.drawable.amigos)


    Column (Modifier.fillMaxWidth())
    {
        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = campus,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Column {
                Text(
                    text = "Mi Campus",
                    style = TextStyle(color = Color.Black, fontSize = 20.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp)
                )

                Text(
                    text = "Campus Central",
                    style = TextStyle(color = Color.Black, fontSize = 15.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(bottom = 10.dp)
                )
            }
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = amigos,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mis Amigos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = calendario,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mi Calendario",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = cursos,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mis Cursos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = notas,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mis Calificaciones",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = grupos,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(text = "Mis Grupos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(
                painter = horario,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp)
            )

            Text(
                text = "Mis Eventos Proximos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    Lab4Theme {
        MyProfilePage()
    }
}

