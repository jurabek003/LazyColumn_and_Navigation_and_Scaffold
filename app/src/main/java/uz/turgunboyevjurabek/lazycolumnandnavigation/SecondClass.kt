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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.Data
import java.io.Serializable

@Composable
fun SecondClass(navController: NavController, key: String?) {
   Column {
       MainUI(key!!)
   }
}

@Composable
fun MainUI(key: String?) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

//        Image(painter =key.img , contentDescription = null)
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Text(text = key.nomi, fontSize = 20.sp)


        Text(text = key!!, fontSize = 15.sp)

    }
}

