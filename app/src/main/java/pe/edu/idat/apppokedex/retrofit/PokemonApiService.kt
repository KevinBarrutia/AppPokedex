package pe.edu.idat.apppokedex.retrofit

import pe.edu.idat.apppokedex.retrofit.response.Pokemon
import pe.edu.idat.apppokedex.retrofit.response.PokemonResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface PokemonApiService {
    @GET("pokemon")
    fun obtenerPokemones(): Call<PokemonResponse>

   /* @POST("pokemon")
    fun registrarPokemon(@Body pokemon:Pokemon)

    @PUT("pokemon")
    fun actualizarPokemon(@Body pokemon:Pokemon)*/
}