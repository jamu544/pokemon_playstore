package android.com.jamsand.io.pokemonappkotlin.model

import android.icu.number.IntegerWidth
import android.widget.ImageView
import androidx.databinding.BindingAdapter


data class Pokemon(var count: String,
                   var next: String,
                   val results:List<PokemonArray>) {

    data class PokemonArray(
    var pokemonID: Int,
    var name:String,
    var url:String)
}