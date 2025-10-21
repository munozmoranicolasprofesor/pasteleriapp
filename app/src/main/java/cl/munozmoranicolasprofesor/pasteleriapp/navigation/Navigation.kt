package cl.munozmoranicolasprofesor.pasteleriapp.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.HomeScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.LoginScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.ProfileScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.RecetasScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.ResumenScreen
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.LoginViewModel
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.MainViewModel
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.UsuarioViewModel

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    val loginViewModel = LoginViewModel()
    val viewModelNavigation: MainViewModel = viewModel()
    val usuarioViewModel : UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "login"
    ){
        composable("login") {
            LoginScreen(navController, loginViewModel)
        }
        composable("home") {
            HomeScreen(navController , viewModelNavigation)
        }
        composable("perfil") {
            ProfileScreen(navController , viewModelNavigation)
        }
        composable("recetas") {
            RecetasScreen(navController, usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}