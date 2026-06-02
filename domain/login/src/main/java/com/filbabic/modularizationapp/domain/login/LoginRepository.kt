package com.filbabic.modularizationapp.domain.login

data class User(val id: String, val username: String)

interface LoginRepository {
    suspend fun login(username: String, password: String): Result<User>
}
