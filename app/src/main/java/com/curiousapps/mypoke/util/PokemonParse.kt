package com.curiousapps.mypoke.util



import androidx.compose.ui.graphics.Color
import com.curiousapps.mypoke.data.remote.responses.StatXX
import com.curiousapps.mypoke.data.remote.responses.Type
import com.curiousapps.mypoke.ui.theme.AtkColor
import com.curiousapps.mypoke.ui.theme.DefColor
import com.curiousapps.mypoke.ui.theme.HPColor
import com.curiousapps.mypoke.ui.theme.SpAtkColor
import com.curiousapps.mypoke.ui.theme.SpDefColor
import com.curiousapps.mypoke.ui.theme.SpdColor
import com.curiousapps.mypoke.ui.theme.TypeBug
import com.curiousapps.mypoke.ui.theme.TypeDark
import com.curiousapps.mypoke.ui.theme.TypeDragon
import com.curiousapps.mypoke.ui.theme.TypeElectric
import com.curiousapps.mypoke.ui.theme.TypeFairy
import com.curiousapps.mypoke.ui.theme.TypeFighting
import com.curiousapps.mypoke.ui.theme.TypeFire
import com.curiousapps.mypoke.ui.theme.TypeFlying
import com.curiousapps.mypoke.ui.theme.TypeGhost
import com.curiousapps.mypoke.ui.theme.TypeGrass
import com.curiousapps.mypoke.ui.theme.TypeGround
import com.curiousapps.mypoke.ui.theme.TypeIce
import com.curiousapps.mypoke.ui.theme.TypeNormal
import com.curiousapps.mypoke.ui.theme.TypePoison
import com.curiousapps.mypoke.ui.theme.TypePsychic
import com.curiousapps.mypoke.ui.theme.TypeRock
import com.curiousapps.mypoke.ui.theme.TypeSteel
import com.curiousapps.mypoke.ui.theme.TypeWater
import java.util.Locale
import java.util.Locale.getDefault

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: StatXX): Color {
    return when(stat.stat.name.lowercase(getDefault())) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: StatXX): String {
    return when(stat.stat.name.lowercase(getDefault())) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}