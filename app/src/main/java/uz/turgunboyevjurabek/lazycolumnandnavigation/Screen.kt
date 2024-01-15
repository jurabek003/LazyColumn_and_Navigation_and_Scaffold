package uz.turgunboyevjurabek.lazycolumnandnavigation

import androidx.compose.runtime.Composable
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.Data

sealed class Screen(val rout:String) {
    object MainClass: Screen("main_class")
    object SecondClass: Screen("second_class")


    fun WithArgs(data: Data):Data {
        return data
    }

}