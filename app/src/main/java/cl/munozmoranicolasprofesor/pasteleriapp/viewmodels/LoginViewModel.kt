package cl.munozmoranicolasprofesor.pasteleriapp.viewmodels

import cl.munozmoranicolasprofesor.pasteleriapp.model.LoginErrores
import cl.munozmoranicolasprofesor.pasteleriapp.model.LoginUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel {
    private val _estado = MutableStateFlow(LoginUIState())

    val estado : StateFlow<LoginUIState> = _estado

    fun onUsuarioChange(valor:String){
        _estado.update { it.copy(usuario = valor, errores = it.errores.copy(usuario = null)) }
    }

    fun onClaveChange(valor:String){
        _estado.update { it.copy(clave = valor, errores = it.errores.copy(clave = null)) }
    }

    fun validar(): Boolean{
        val estadoActual = _estado.value
        val errores = LoginErrores(
            usuario = if (!estadoActual.usuario.equals("Admin")) "Usuario incorrecto" else null,
            clave = if (!estadoActual.clave.equals("admin1234")) "Clave incorrecta" else null
        )

        val hayErrrores = listOfNotNull(
            errores.usuario,
            errores.clave
        ).isNotEmpty()

        _estado.update { it.copy( errores = errores) }

        return !hayErrrores
    }
}