package brafacapi.com.bienvenidos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import brafacapi.com.bienvenidos.ui.theme.BienvenidosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting(name = "brayan")
                    Prueba()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "",
        modifier = modifier
    )
    Prueba()
}
@Composable
fun Prueba (){
    Box {
        Column(
            //textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            //background = Color(0xFF0BB000)
        ){
            Text ("Bienvenido",
                color = Color.Blue,
                fontSize = 48.sp,
                modifier = Modifier
                    .border(5.5.dp, MaterialTheme.colorScheme.secondary,)
                    .padding(vertical = 40.dp, horizontal = 20.dp),
                )
            Button(onClick = { /* Do something! */ })
            {
                Text("Ingresar")
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BienvenidosTheme {
        Column {
            //Greeting("brayan")
            Prueba()
        }

    }
}