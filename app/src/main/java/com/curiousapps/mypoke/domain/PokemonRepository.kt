package com.curiousapps.mypoke.domain

import com.curiousapps.mypoke.data.remote.responses.Pokemon
import com.curiousapps.mypoke.data.remote.responses.PokemonList
import com.curiousapps.mypoke.network.PokeApi
import com.curiousapps.mypoke.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>
}

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokeApi
) : PokemonRepository {
    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {

        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred: $e")
        }
        Timber.tag("enoch").i("getPokemonList:%s", Resource.Success(response))
        return Resource.Success(response)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred: $e")
        }
        return Resource.Success(response)
    }
}
