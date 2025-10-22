import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maverick.androidprojectweek7.ui.theme.AndroidProjectWeek7Theme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    Text (
        text = "Ini terence hacking kamu",
        style = MaterialTheme.typography.headlineLarge
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidProjectWeek7Theme {
        Greeting("Android")
    }
}