package com.filbabic.modularizationapp.data.login

import com.filbabic.modularizationapp.domain.login.LoginRepository
import com.filbabic.modularizationapp.domain.login.User

class LoginRepositoryImpl : LoginRepository {
    override suspend fun login(username: String, password: String): Result<User> {
        // Mock implementation
        return if (username.isNotBlank() && password.isNotBlank()) {
            Result.success(User("1", username))
        } else {
            Result.failure(Exception("Invalid credentials"))
        }
    }
}
