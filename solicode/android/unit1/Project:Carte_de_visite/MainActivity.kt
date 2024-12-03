package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Image1(
                        message = "",
                        modifier = Modifier
                    )
                    Greeting(name = "")
                }
            }
        }
    }
}

@Composable
fun Image1(message:String, modifier: Modifier){
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .offset(x = 0.dp, y = (-140.dp))
            .aspectRatio(14f / 7f)
    )
    Greeting(
        name = "",
    )
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = "Jennifer Doe",
            fontSize = 16.sp,
            modifier = modifier
                .padding(
                    start = 140.dp,
                    top = 400.dp,
                )
        )
        Text(
            text = "Android developper extraordinaire",
            fontSize = 10.sp,
            modifier = modifier
                .padding(
                    start = 110.dp,
                    bottom = 30.dp
                )
        )
        Text(
            text = "+11 (123) 444 555 666",
            modifier = modifier
                .padding(
                    start = 110.dp,
                    top = 200.dp,
                )
        )
        Text(
            text = "@AndroidDev",
            modifier = modifier
                .padding(
                    start = 110.dp,
                )
        )
        Text(
            text = "jen.doe@android.com",
            modifier = modifier
                .padding(
                    start = 110.dp,
                )
        )
    }
}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteTheme {
        Greeting("Android")
    }
}*/