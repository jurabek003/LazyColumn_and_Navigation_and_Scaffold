package uz.turgunboyevjurabek.lazycolumnandnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.lazycolumnandnavigation.Screen

@Composable
fun Navigation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainClass.rout){
        composable(route= Screen.MainClass.rout){
            MainClass(navController = navController)
        }
        composable(route = Screen.SecondClass.rout){

        }

    }

}