package com.codigo.zoologicoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codigo.zoologicoapp.ui.theme.ZoologicoAppTheme

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // ✅ Mantener XML
    }
}


   // override fun onCreate(savedInstanceState: Bundle?) {
     //   super.onCreate(savedInstanceState)
      //  enableEdgeToEdge()
      //  setContent {
        //    ZoologicoAppTheme {
          //      Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            //        Greeting(
              //          name = "Android",
                //        modifier = Modifier.padding(innerPadding)
                  //  )
             //   }
         //   }
      //  }
  //  }
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
 //   Text(
  //      text = "Hello $name!",
   //     modifier = modifier
  //  )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
  //  ZoologicoAppTheme {
    //    Greeting("Android")
   // }
