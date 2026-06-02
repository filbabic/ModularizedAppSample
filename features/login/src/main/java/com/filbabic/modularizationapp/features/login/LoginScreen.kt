package com.filbabic.modularizationapp.features.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.filbabic.modularizationapp.core.ResourceUtils
import com.filbabic.modularizationapp.core.Route
import org.koin.androidx.compose.koinViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = koinViewModel(),
    onNavigateToRegister: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Login Screen", style = MaterialTheme.typography.headlineMedium)
        Text(text = ResourceUtils.getGreeting())
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = { viewModel.loginUser("test", "password") }) {
            Text(text = "Login")
        }
        
        Button(onClick = onNavigateToRegister) {
            Text(text = "Go to Register")
        }
    }
}
