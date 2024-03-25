package pe.edu.idat.apppokedex.retrofit

import pe.edu.idat.apppokedex.retrofit.response.Pokemon
import pe.edu.idat.apppokedex.retrofit.response.PokemonResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query
import java.time.ZoneOffset

interface PokemonApiService {
    @GET("pokemon")
    fun obtenerPokemones(@Query("offset")offset: Int, @Query("limit")limit:Int): Call<PokemonResponse>

   /* @POST("pokemon")
    fun registrarPokemon(@Body pokemon:Pokemon)

    @PUT("pokemon")
    fun actualizarPokemon(@Body pokemon:Pokemon)*/
}