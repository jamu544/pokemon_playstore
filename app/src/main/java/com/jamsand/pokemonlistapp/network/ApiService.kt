package android.com.jamsand.io.pokemonappkotlin.network

import android.com.jamsand.io.pokemonappkotlin.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("https://pokeapi.co/api/v2/pokemon/")
    fun getPokemon(): Call<Pokemon>
}