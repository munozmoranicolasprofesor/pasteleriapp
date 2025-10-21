package cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.old

import androidx.compose.runtime.Composable
import cl.munozmoranicolasprofesor.pasteleriapp.ui.utils.obtenerWindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreenMain(){
    val windowSizeClass = obtenerWindowSizeClass()
    when (windowSizeClass.widthSizeClass){
        WindowWidthSizeClass.Compact -> HomeScreemCompacta()
        WindowWidthSizeClass.Medium -> HomeScreemMediana()
        WindowWidthSizeClass.Expanded -> HomeScreemExtendida()
    }
}

@Preview(name = "Compacta", widthDp = 360, heightDp = 800)
@Composable
fun PreviewCompacta(){
    HomeScreemCompacta()
}

@Preview(name = "Mediana", widthDp = 600, heightDp = 800)
@Composable
fun PreviewMediana(){
    HomeScreemMediana()
}

@Preview(name = "Extendida", widthDp = 840, heightDp = 800)
@Composable
fun PreviewExtendida(){
    HomeScreemExtendida()
}