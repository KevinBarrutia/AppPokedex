package pe.edu.idat.apppokedex.retrofit.response

data class PokemonResponse (
    val count: Int,
    val next: String,
    val previuos: String,
    val results: List<Pokemon>
)