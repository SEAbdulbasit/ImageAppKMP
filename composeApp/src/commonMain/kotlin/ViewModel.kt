import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import network.Network
import network.model.PixabayImages


/**
 * Created by abdulbasit on 16/12/2023.
 */
class ViewModel {
    private val network = Network()
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    private val _pixabayImages = MutableStateFlow<PixabayImages?>(null)
    val pixabayImages: StateFlow<PixabayImages?> = _pixabayImages

    init {
        scope.launch {
            _pixabayImages.update { network.getFlowers() }
        }
    }

    companion object {
        private var viewModel: ViewModel? = null
        fun getViewModel(): ViewModel {
            if (viewModel == null) {
                viewModel = ViewModel()
            } else {
                viewModel
            }
            return viewModel!!
        }
    }

}