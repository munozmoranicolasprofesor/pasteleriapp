package cl.munozmoranicolasprofesor.pasteleriapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cl.munozmoranicolasprofesor.pasteleriapp.viewmodels.UsuarioViewModel

@Composable
fun ResumenScreen(viewModel: UsuarioViewModel){
    val estado by viewModel.estado.collectAsState()

    Column(Modifier.padding(16.dp)) {
        Text("Resumen del Registro", style = MaterialTheme.typography.headlineMedium)
        Text("Nombre: ${estado.nombre}")
        Text("Correo: ${estado.correo}")
        Text("Direccion: ${estado.direccion}")
        Text("Contraseña: ${"*".repeat(estado.clave.length)}")
        Text("Terminos: ${if (estado.aceptaTerminos) "Aceptados" else "No aceptados"}")
    }
}