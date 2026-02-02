plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.weatherapp"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.material3)
    // Material icons (extended) for Icons.Default.* vectors
    implementation("androidx.compose.material:material-icons-extended")
    // Coroutines for rememberCoroutineScope, delay, launch
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    // Retrofit for networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // (Optional) Gson converter for Retrofit
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    // Gson core library
    implementation("com.google.code.gson:gson:2.10.1")
    // LiveData for Compose observeAsState
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    // ViewModel for managing UI state
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    // Compose LiveData integration
    implementation("androidx.compose.runtime:runtime-livedata:1.6.0")
    // Coil for image loading in Compose
    implementation("io.coil-kt:coil-compose:2.5.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}