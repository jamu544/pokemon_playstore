package android.com.jamsand.io.pokemonappkotlin.network

import android.com.jamsand.io.pokemonappkotlin.model.Pokemon
import android.com.jamsand.io.pokemonappkotlin.utilities.BASE_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PokemonListApiService {

    @GET("https://pokeapi.co/api/v2/pokemon/")
    fun getPokemons(): Call<Pokemon>

    companion object {
        var retrofitServicePokemonList: PokemonListApiService? = null
        fun getInstance() : PokemonListApiService {
            if(retrofitServicePokemonList == null) {
                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                retrofitServicePokemonList = retrofit.create(PokemonListApiService::class.java)
            }
            return retrofitServicePokemonList!!
        }
    }




}