package br.senai.sp.jandira.model

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val type: String = "",
    val gender: String = "",
    val origin: Origin = Origin(),
    val location: Location = Location(),
    val image: String = "",
    val episodes: List<String> = listOf(),
    val url:String = "",
    val created: String="",
)
