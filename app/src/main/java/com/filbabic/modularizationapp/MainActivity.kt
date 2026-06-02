package com.filbabic.modularizationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.filbabic.modularizationapp.core.Route
import com.filbabic.modularizationapp.features.login.LoginScreen
import com.filbabic.register.RegisterScreen
import com.filbabic.modularizationapp.ui.theme.ModularizationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModularizationAppTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Route.Login,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable<Route.Login> {
                            LoginScreen(
                                onNavigateToRegister = {
                                    navController.navigate(Route.Register)
                                }
                            )
                        }
                        composable<Route.Register> {
                            RegisterScreen(
                                onNavigateBack = {
                                    navController.popBackStack()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

// Removed NavigationHost as it's replaced by NavHost block