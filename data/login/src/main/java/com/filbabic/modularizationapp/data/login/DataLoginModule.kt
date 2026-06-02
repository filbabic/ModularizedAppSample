package com.filbabic.modularizationapp.data.login

import com.filbabic.modularizationapp.domain.login.LoginRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataLoginModule = module {
    singleOf(::LoginRepositoryImpl) { bind<LoginRepository>() }
}
