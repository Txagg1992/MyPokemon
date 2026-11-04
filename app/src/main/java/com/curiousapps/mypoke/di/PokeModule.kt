package com.curiousapps.mypoke.di

import com.curiousapps.mypoke.domain.PokemonRepository
import com.curiousapps.mypoke.domain.PokemonRepositoryImpl
import com.curiousapps.mypoke.network.PokeApi
import com.curiousapps.mypoke.util.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeModule {

    @Provides
    @Singleton
    fun providesPokemonRepo(
        api: PokeApi
    ): PokemonRepository {
        return PokemonRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun providesPokeApi(): PokeApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}