package com.example.artgallery

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artgallery.ui.theme.ArtGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtGalleryTheme {
                Caroussel()
            }
        }
    }
}


@Composable
fun Caroussel(){
    val images  = listOf(R.drawable.pottery , R.drawable.landmarks , R.drawable.beaches)
    val descriptions = listOf(
        "Safi has a long-standing tradition of pottery making that dates back centuries. The city's artisans are skilled in producing a wide variety of ceramic pieces, ranging from simple utilitarian objects to intricate, decorative works. Safi pottery is characterized by its vibrant colors, intricate patterns, and unique glazes.",
        "Safi is a coastal city with a beautiful coastline, offering visitors a variety of beaches to enjoy. These beaches are ideal for swimming, sunbathing, and water sports.",
        "Safi is home to several historical landmarks that offer insights into the city's past. These landmarks include:\n" +
                "\n" +
                "Ksar El Bahr Fortress: This Portuguese-built fortress is a prominent landmark in Safi. It was constructed in the 16th century and offers panoramic views of the city and the ocean.\n" +
                "National Museum of Ceramics: This museum showcases a collection of Safi pottery, including ancient pieces and contemporary works. The museum provides visitors with an opportunity to learn about the city's long-standing pottery tradition.\n" +
                "Old Medina: Safi's old medina is a historic district with narrow, winding streets and traditional Moroccan architecture. The medina is home to numerous shops, cafes, and historical sites.\n")
    var index by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = images[index]),
            contentDescription = "",
            modifier = Modifier
                .aspectRatio(12f/9f)
        )
        Text(
            text = descriptions[index],
            modifier = Modifier
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 14.sp
        )
        Button(onClick = {
            index = if (index < images.size - 1) index + 1 else 0
        }) {
            Text(
                text = "Next ->",
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtGalleryTheme {}
}
