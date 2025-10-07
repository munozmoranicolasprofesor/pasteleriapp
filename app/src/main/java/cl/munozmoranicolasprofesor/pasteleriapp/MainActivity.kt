package cl.munozmoranicolasprofesor.pasteleriapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.munozmoranicolasprofesor.pasteleriapp.navigation.AppNavigation
import cl.munozmoranicolasprofesor.pasteleriapp.navigation.NavigationEvent
import cl.munozmoranicolasprofesor.pasteleriapp.navigation.Screen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.theme.PasteleriappTheme
import cl.munozmoranicolasprofesor.pasteleriapp.ui.HomeScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.ProfileScreen
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.SettingScreen
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.MainViewModel
import kotlinx.coroutines.flow.collectLatest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PasteleriappTheme {
                /*val viewModel: MainViewModel = viewModel()
                val navController = rememberNavController()

                LaunchedEffect(key1 = Unit) {
                    viewModel.navigationEvents.collectLatest { event ->
                        when(event){
                            is NavigationEvent.NavigateTo -> {
                                navController.navigate(event.route.route){
                                    event.popUpToRoute?.let{
                                        popUpTo(it.route){
                                            inclusive = event.inclusive
                                        }
                                    }
                                    launchSingleTop = event.singleTop
                                    restoreState = true
                                }
                            }
                            is NavigationEvent.PopBackStack -> navController.popBackStack()
                            is NavigationEvent.NavigateUp -> navController.navigateUp()
                        }
                    }
                }*/
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Box(Modifier.padding(innerPadding)){
                        AppNavigation()
                    }

                    /*NavHost(
                        navController = navController,
                        startDestination = Screen.Home.route,
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable(route = Screen.Home.route){
                            HomeScreen(navController = navController, viewModel = viewModel)
                        }
                        composable(route = Screen.Profile.route){
                            ProfileScreen(navController = navController, viewModel = viewModel)
                        }
                        composable(route = Screen.Setting.route){
                            SettingScreen(navController = navController, viewModel = viewModel)
                        }
                    }*/
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GeneralPreview() {
    PasteleriappTheme {

    }
}