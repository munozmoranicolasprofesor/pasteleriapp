package cl.munozmoranicolasprofesor.pasteleriapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.RegistroScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.ResumenScreen
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.UsuarioViewModel

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    val usuarioViewModel : UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "registro"
    ){
        composable("registro") {
            RegistroScreen(navController,usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}