package android.com.jamsand.io.pokemonappkotlin.network

import android.com.jamsand.io.pokemonappkotlin.model.Details
import android.com.jamsand.io.pokemonappkotlin.utilities.BASE_URL
import android.com.jamsand.io.pokemonappkotlin.utilities.POKEMON_DETAILS_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonDetailsApiService {

    @GET("https://pokeapi.co/api/v2/pokemon/{name}")
    fun getPokemonDetails(@Path("name") name: String): Call<Details>

    companion object {
        var retrofitServicePokemonDetails: PokemonDetailsApiService? = null
        fun getInstance(): PokemonDetailsApiService {
            if (retrofitServicePokemonDetails == null) {
                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(POKEMON_DETAILS_URL)
                    .build()
                retrofitServicePokemonDetails = retrofit.create(PokemonDetailsApiService::class.java)
            }
           return retrofitServicePokemonDetails!!

        }
    }

}