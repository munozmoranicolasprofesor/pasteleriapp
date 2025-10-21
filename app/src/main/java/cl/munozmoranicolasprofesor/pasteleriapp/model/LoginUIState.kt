package cl.munozmoranicolasprofesor.pasteleriapp.model

data class LoginUIState(
    val usuario : String = "",
    val clave : String = "",
    val errores : LoginErrores = LoginErrores(),
)

