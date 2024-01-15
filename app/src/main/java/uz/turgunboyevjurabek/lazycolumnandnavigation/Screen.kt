package uz.turgunboyevjurabek.lazycolumnandnavigation

sealed class Screen(val rout:String) {
    object MainClass: Screen("main_class")
    object SecondClass: Screen("second_class")


}