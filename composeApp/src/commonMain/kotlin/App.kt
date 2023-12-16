import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import network.model.Hit
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val viewModel = ViewModel.getViewModel()
        val state by viewModel.pixabayImages.collectAsState()
        PicturesList(state?.hits?: emptyList())

    }
}


@Composable
fun PicturesList(hits: List<Hit?>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(hits){
            Text(modifier = Modifier.fillMaxWidth(), text = it?.largeImageURL!!)
        }
    }
}