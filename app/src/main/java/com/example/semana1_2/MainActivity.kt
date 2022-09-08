package com.example.semana1_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.semana1_2.ui.theme.Semana1_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            principal()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun principal() {

    LazyColumn(){
        items(1){

            Column {

                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp))
                {
                    Text(text = "SUPER HEROES",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }


                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize())
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://static.wikia.nocookie.net/doblaje/images/9/9f/The_Amazing_Spider-Man.jpg/revision" +
                                    "/latest/scale-to-width-down/350?cb=20181001213120&path-prefix=es")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp))
                {
                    Text(text = "Hombre Araña",
                        fontWeight = FontWeight.Bold)
                }


                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize())
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://i0.wp.com/imgs.hipertextual.com/wp-content/uploads/2019/05/hipertextual-avengers-endgame-futuro-capitan-america-2019781893-scaled.jpg?w=1560&quality=50&strip=all&ssl=1")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp))
                {
                    Text(text = "Capitan América",
                        fontWeight = FontWeight.Bold)
                }



                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize())
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/el-increible-hulk-1554403044.jpg?resize=980:*")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp))
                {
                    Text(text = "Holk",
                        fontWeight = FontWeight.Bold)
                }


                Box(modifier = Modifier
                    .height(200.dp)
                    .fillMaxSize())
                {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://elcomercio.pe/resizer/TO8T_FMfFjgV2g7xsWgL_ZGcjbw=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/3SAGW2TYSVD6LARR4MNIF5YEPY.jpg")
                            .transformations(CircleCropTransformation())
                            .build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Box(
                    contentAlignment=Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp))
                {
                    Text(text = "Thor",
                        fontWeight = FontWeight.Bold)
                }



            }
        }
     }
}