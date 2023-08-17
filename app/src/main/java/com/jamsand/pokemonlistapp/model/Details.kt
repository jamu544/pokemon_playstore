package android.com.jamsand.io.pokemonappkotlin.model

data class Details( var name: String,
                    var url: String,
                    var height: Int,
                    var weight:String,
                    val types: List<Type>,
                    val sprites: Sprites) {

data class Type(var type: PokemonType)
data class PokemonType(var name: String)
data class Sprites(var other: Other)

data class Other(var home: Home)

data class Home(var front_default: String)

}