package android.com.jamsand.io.pokemonappkotlin.repository

import android.com.jamsand.io.pokemonappkotlin.network.PokemonListApiService

class PokemonRepository constructor(private val retrofitServicePokemonList: PokemonListApiService){

    fun getAllPokemons () = retrofitServicePokemonList.getPokemons()

}