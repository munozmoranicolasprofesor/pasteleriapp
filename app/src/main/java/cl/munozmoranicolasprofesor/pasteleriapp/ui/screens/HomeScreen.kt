package cl.munozmoranicolasprofesor.pasteleriapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.MainViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.components.navigationBarScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: MainViewModel = viewModel()
){

    Scaffold(
        bottomBar = {
            navigationBarScreen(navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("¡Bienvenido al PasteleriApp!")
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    //HomeScreen()
}*/