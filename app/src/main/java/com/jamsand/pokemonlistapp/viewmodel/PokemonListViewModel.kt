package android.com.jamsand.io.pokemonappkotlin.viewmodel

import android.com.jamsand.io.pokemonappkotlin.model.Details
import android.com.jamsand.io.pokemonappkotlin.model.Pokemon
import android.com.jamsand.io.pokemonappkotlin.network.PokemonDetailsApiService
import android.com.jamsand.io.pokemonappkotlin.repository.PokemonRepository
import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonListViewModel constructor(private val repository: PokemonRepository):
ViewModel(){

    val pokemonList = MutableLiveData<List<Pokemon.PokemonArray>>()
    val errorMessage = MutableLiveData<String>()



    fun getAllPokemons (){
        val response = repository.getAllPokemons()
        response.enqueue (object : Callback<Pokemon> {
            override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                    pokemonList.postValue(response.body()?.results)
            }
            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    errorMessage.postValue(t.message)
            }
        })
    }

}