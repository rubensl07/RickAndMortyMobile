package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.senai.sp.jandira.screens.CharacterDetails
import br.senai.sp.jandira.screens.ListAllCharacters
import br.senai.sp.jandira.ui.theme.RickAndMortyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface (
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ){
            RickAndMortyTheme {
                val controleNavegacao = rememberNavController()
                NavHost(
                    navController = controleNavegacao,
                    startDestination = "ListaPersonagens"
                ){
                    composable(route = "ListaPersonagens") { ListAllCharacters(controleNavegacao)}
//                    composable(route = "DetalhesPersonagem/{id}", arguments = ListOf(navArgument("characterId"){type = NavType.IntType})) { backStackEntry -> CharacterDetails(controleNavegacao, backStackEntry.arguments?.getInt("id") ?: 0) }
                }
                ListAllCharacters(controleNavegacao)
            }}
        }
    }
}




