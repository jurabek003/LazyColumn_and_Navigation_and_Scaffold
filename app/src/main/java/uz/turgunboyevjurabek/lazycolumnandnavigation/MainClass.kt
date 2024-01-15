package uz.turgunboyevjurabek.lazycolumnandnavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.Data

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainClass(navController: NavController) {
    val myscrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Column(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .nestedScroll(myscrollBehavior.nestedScrollConnection),
            topBar = {
                TopAppBar(
                    title = { Text(text = "Jetpack Compose") },
                    colors = topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
                    scrollBehavior = myscrollBehavior,
                    actions = {
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Localized description"
                            )
                        }
                    }
                )
            }

        ) {innerPadding->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                val list=ArrayList<Data>()
                list.addAll(listOf(
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                    Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","Jetpack Compose"),
                ))
                LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 180.dp),
                    content = {
                        items(list.size){
                            ItemUi(data = list[it],navController)
                        }
                    })
            }

        }
    }
}
@Composable
fun ItemUi(data: Data,navController: NavController) {
    Card(modifier = Modifier
        .width(180.dp)
        .height(150.dp)
        .padding(10.dp)
        .clip(RoundedCornerShape(15.dp))

    ){
        Column(modifier = Modifier
            .clickable {
                navController.navigate(Screen.SecondClass.rout)
            }
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Magenta,
                        Color.Transparent
                    ), endY = 300f
                )
            )) {
            Image(painter = data.img, contentDescription = null, modifier = Modifier
                .fillMaxWidth()
                .height(70.dp))
            Text(text = data.nomi, fontWeight = FontWeight.SemiBold, fontFamily = FontFamily.Serif, color = Color.Black, fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = data.description, fontWeight = FontWeight.SemiBold, fontFamily = FontFamily.Serif, color = Color.Black, fontSize = 15.sp, modifier = Modifier.padding(start = 10.dp))

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun UI() {
    Column {
        val data=Data(painterResource(id = R.drawable.ic_launcher_foreground),"android","Jetpack Compose")

    }
}