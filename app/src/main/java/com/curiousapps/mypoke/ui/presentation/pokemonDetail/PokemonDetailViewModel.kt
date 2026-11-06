package com.curiousapps.mypoke.ui.presentation.pokemonDetail

import androidx.lifecycle.ViewModel
import com.curiousapps.mypoke.data.remote.responses.Pokemon
import com.curiousapps.mypoke.domain.PokemonRepository
import com.curiousapps.mypoke.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}