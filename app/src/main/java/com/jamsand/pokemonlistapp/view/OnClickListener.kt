package android.com.jamsand.io.pokemonappkotlin.view

import android.com.jamsand.io.pokemonappkotlin.model.Pokemon

class OnClickListener(val clickListener:(pokemon: Pokemon.PokemonArray) -> Unit) {
    fun onClick(pokemon: Pokemon.PokemonArray, position: Int) = clickListener(pokemon)
}