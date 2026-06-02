plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.filbabic.modularizationapp.data.login"
    compileSdk = 35

    defaultConfig {
        minSdk = 29
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(project(":domain:login"))
    implementation(project(":core"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.koin.core)
}
