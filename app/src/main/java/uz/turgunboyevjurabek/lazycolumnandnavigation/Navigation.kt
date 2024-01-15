package uz.turgunboyevjurabek.lazycolumnandnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import uz.turgunboyevjurabek.lazycolumnandnavigation.madels.Data

@Composable
fun Navigation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainClass.rout){
        composable(route= Screen.MainClass.rout){
            MainClass(navController = navController)
        }
        composable(route = Screen.SecondClass.rout+"/{key}",
            arguments = listOf(navArgument("key"){
                type= NavType.StringType
                defaultValue="allambalo"
                nullable=true
            })
        ){

            SecondClass(navController = navController, key = it.arguments?.getString("key") )

        }

    }

}