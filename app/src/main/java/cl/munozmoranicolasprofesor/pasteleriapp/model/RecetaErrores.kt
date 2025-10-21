package cl.munozmoranicolasprofesor.pasteleriapp.model

data class RecetaErrores(
    val id : String? = null,
    val nombre : String? = null,
    val descripcion : String? = null,
    val tiempo : String? = null,
    val dificultad : String? = null,
    val ingredientes : List<String>? = null,
    val preparacion : String? = null,
)
