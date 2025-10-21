package cl.munozmoranicolasprofesor.pasteleriapp.ui.screens.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun navigationBarScreen(
    navController: NavController,
){
    val items = listOf("home", "perfil","registro")
    var selectedItem by remember { mutableStateOf(value = 0) }

    NavigationBar {
        items.forEachIndexed { index, screen ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(screen)
                },
                label = { Text(screen) },
                icon = {
                    Icon(
                        imageVector = if (screen == "home") Icons.Default.Home else if (screen == "perfil") Icons.Default.Person else Icons.Default.Build,
                        contentDescription = screen
                    )
                }
            )
        }
    }
}