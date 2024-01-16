package uz.turgunboyevjurabek.lazycolumnandnavigation.madels

import androidx.compose.ui.graphics.painter.Painter
import java.io.Serializable

data class Data(var img:Painter, var nomi: String, var description: String):Serializable {
    override fun toString(): String {
        return "Data(img=$img, nomi='$nomi', description='$description')"
    }
}
