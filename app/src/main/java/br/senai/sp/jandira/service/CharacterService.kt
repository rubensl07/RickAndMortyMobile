package br.senai.sp.jandira.service

import br.senai.sp.jandira.model.Character
import br.senai.sp.jandira.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CharacterService {
    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): Call<br.senai.sp.jandira.model.Character>

    @GET("character")
    fun getAllCharacters(): Call<Result>

    @POST("character")
    fun saveCharacter(@Body character: Character): Call<Character>
}