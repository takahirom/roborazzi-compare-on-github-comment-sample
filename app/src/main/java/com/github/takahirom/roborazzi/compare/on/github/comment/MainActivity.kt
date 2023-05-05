package com.github.takahirom.roborazzi.compare.on.github.comment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.github.takahirom.roborazzi.compare.on.github.comment.ui.theme.RoborazziscreenshotcompareongithubcommentsampleTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      RoborazziscreenshotcompareongithubcommentsampleTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Greeting("Roborazzi")
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    style = MaterialTheme.typography.displayLarge,
    modifier = modifier
      .testTag("hello_text")
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  RoborazziscreenshotcompareongithubcommentsampleTheme {
    Greeting("Roborazzi")
  }
}
