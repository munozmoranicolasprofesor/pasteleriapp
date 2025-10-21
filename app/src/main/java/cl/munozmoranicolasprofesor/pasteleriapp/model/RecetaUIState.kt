package cl.munozmoranicolasprofesor.pasteleriapp.model

data class RecetaUIState(
    val id : String = "",
    val nombre : String = "",
    val descripcion : String = "",
    val tiempo : String = "",
    val dificultad : String = "",
    val ingredientes : List<String> = mutableListOf(),
    val preparacion : String = "",
    val errores : RecetaErrores = RecetaErrores(),
)
