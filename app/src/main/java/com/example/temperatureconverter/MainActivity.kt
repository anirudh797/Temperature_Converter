package com.example.temperatureconverter

import android.accounts.AuthenticatorDescription
import android.media.Image
import android.os.Bundle
import android.provider.SyncStateContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.temperatureconverter.ui.theme.TemperatureConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Greeting("Hi, Anirudh this side")
                Greeting("Hi, Anirudh this side 2")


            }
           Greeting("Hi, Anirudh this side")
        }
    }
}

@Composable
fun Header(image:Int, description: String){

    Image( painterResource(id = image),
        contentDescription = description
    ,modifier = Modifier.height(180.dp).fillMaxWidth(),
        contentScale = ContentScale.Crop
    )

}

@Composable
fun MainActivityContent(){
    Header(androidx.core.R.drawable.notification_bg_low_pressed,"sunrise image")
}

@Preview(showBackground = true)
@Composable
fun Greeting(name: String ="anirudh") {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TemperatureConverterTheme {
        Greeting("Android")
    }
}