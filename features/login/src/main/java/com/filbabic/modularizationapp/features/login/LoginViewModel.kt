package com.filbabic.modularizationapp.features.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.filbabic.modularizationapp.domain.login.LoginRepository
import kotlinx.coroutines.launch

class LoginViewModel(
    private val repository: LoginRepository
) : ViewModel() {

    fun loginUser(email: String, password: String) {
        viewModelScope.launch {
            repository.login(email, password).onSuccess { user ->
                // Handle successful login, e.g., navigate to the next screen
            }.onFailure { error ->
                // Handle login failure, e.g., show an error message
            }
        }
    }
}