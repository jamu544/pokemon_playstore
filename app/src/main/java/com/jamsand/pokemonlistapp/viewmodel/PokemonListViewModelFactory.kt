package android.com.jamsand.io.pokemonappkotlin.viewmodel

import android.com.jamsand.io.pokemonappkotlin.repository.PokemonRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class PokemonListViewModelFactory constructor(private val repository: PokemonRepository):
ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return if (modelClass.isAssignableFrom(PokemonListViewModel::class.java)){
           PokemonListViewModel(this.repository) as T }
        else {
            throw IllegalArgumentException("ViewModel Not Found")
       }
    }
}