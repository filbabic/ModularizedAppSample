package com.filbabic.modularizationapp.features.login

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val featureLoginModule = module {
    viewModelOf(::LoginViewModel)
}
