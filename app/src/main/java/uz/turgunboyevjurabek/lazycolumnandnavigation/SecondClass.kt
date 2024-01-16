package uz.turgunboyevjurabek.lazycolumnandnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.Data
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.DataObject
import java.io.Serializable

@Composable
fun SecondClass(navController: NavController) {
   Column {
       MainUI()
   }
}

@Composable
fun MainUI() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        val dataObject=DataObject

        Image(painter =dataObject.data?.img!! , contentDescription = null)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = dataObject.data!!.nomi.toString(), fontSize = 20.sp, fontFamily = FontFamily.Serif, fontWeight = FontWeight.W900, color = Color.Red, fontStyle = FontStyle.Italic)

        Text(text = dataObject.data!!.description.toString(), fontSize = 15.sp,fontFamily = FontFamily.Serif, fontWeight = FontWeight.W500, color = Color.Blue, fontStyle = FontStyle.Italic)

    }
}

