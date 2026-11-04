package com.curiousapps.mypoke.network

import com.curiousapps.mypoke.data.remote.responses.Pokemon
import com.curiousapps.mypoke.data.remote.responses.PokemonList
import com.curiousapps.mypoke.util.URL_EXT
import com.curiousapps.mypoke.util.URL_EXT_PATH
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET(URL_EXT)
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("$URL_EXT/${URL_EXT_PATH}")
    suspend fun getPokemonInfo(
        @Path("pokemonName") pokemonName: String
    ): Pokemon

}