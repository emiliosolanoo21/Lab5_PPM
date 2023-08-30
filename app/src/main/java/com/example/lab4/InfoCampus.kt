package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class InfoCampus : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PageInfo()
                }
            }
        }
    }
}

@Composable
fun PageInfo() {
    val context = LocalContext.current

    BackHandler {
        context.findActivity()?.finish()
    }
    Surface {
        Column {
            CampusCentral()
            Featured()
            ServicesAndResources()
        }
    }
}

@Composable
fun CampusCentral(){
    val campus = painterResource(id = R.drawable.cit_uvg)
    val atras = painterResource(id = R.drawable.flecha_atras)
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row ()
        {
            Text(text = "Campus Central",
                 style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                 modifier = Modifier.padding(20.dp))

            Image(
                painter = atras,
                contentDescription = null,
                modifier = Modifier
                    .absoluteOffset(0.dp, 16.dp)
                    .size(40.dp)
                    .clickable { context.startActivity(Intent(context, MainActivity::class.java)) }
            )
        }
        Image(painter = campus,
              contentDescription = null,
              contentScale = ContentScale.Crop,
              modifier = Modifier.height(200.dp))
    }
}
@Composable
fun Featured(){
    Text(text = "Destacados",
         style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
         modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier
        .fillMaxWidth()
        .size(180.dp),
         horizontalArrangement = Arrangement.SpaceBetween)
    {
        Service_Now(modifier = Modifier.weight(1f))
        News(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Service_Now(modifier: Modifier = Modifier){
    val sn = painterResource(id = R.drawable.servicenow)

    Column (modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = sn,
              contentDescription = null,
              modifier = Modifier.size(100.dp))

        Box(modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = Color(21, 115, 32)))
        {
            Text(text = "Service Now",
                 style = TextStyle(color = Color.White, fontSize = 15.sp),
                 modifier = Modifier.padding(15.dp))
        }
    }
}

@Composable
fun News(modifier: Modifier = Modifier){
    val news = painterResource(id = R.drawable.news)

    Column(modifier = modifier,
           horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = news,
              contentDescription = null,
              contentScale = ContentScale.Crop,
              modifier = Modifier
                .width(180.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)))

        Box(modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = Color.DarkGray))
        {
            Text(text = "Actualidad UVG",
                 style = TextStyle(color = Color.White, fontSize = 15.sp),
                 modifier = Modifier.padding(15.dp))
        }
    }
}


@Composable
fun ServicesAndResources() {
    Text(text = "Servicios y Recursos",
         style = TextStyle(color = Color.Gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
         modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier
        .fillMaxWidth()
        .size(180.dp),
         horizontalArrangement = Arrangement.SpaceBetween)
    {
        ServiceDirectory(modifier = Modifier.weight(1f))
        Library(modifier = Modifier.weight(1f))
    }
}

@Composable
fun ServiceDirectory(modifier: Modifier = Modifier) {
    val services = painterResource(R.drawable.servicios)

    Column(
        modifier = modifier,
           horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = services,
              contentDescription = null,
              contentScale = ContentScale.Crop,
              modifier = Modifier
                  .width(180.dp)
                  .height(100.dp)
                  .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
                  )
        )

        Box(
            modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = Color(21, 115, 32))
            .padding(10.dp)
        )
        {
            Text(text = "Directorio de Servicios Estudiantiles",
                 style = TextStyle(color = Color.White, fontSize = 15.sp))
        }
    }
}

@Composable
fun Library(modifier: Modifier = Modifier) {
    val bib = painterResource(id = R.drawable.coleccion_especiales_)

    Column (
        modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Image(
            painter = bib,
            contentDescription = null,
            modifier = Modifier.height(100.dp)
        )

        Box(
            modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = Color.DarkGray)
            .padding(10.dp)
        )
        {
            Text(
                text = "Portal Web Bibliotecas UVG",
                 style = TextStyle(color = Color.White, fontSize = 15.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInfoCampus() {
    Lab4Theme {
        PageInfo()
    }
}