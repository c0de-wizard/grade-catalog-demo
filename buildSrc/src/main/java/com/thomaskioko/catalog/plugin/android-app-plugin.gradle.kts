@file:Suppress("UnstableApiUsage")

import util.libs

plugins {
    id("com.android.application")
    kotlin("android")
}

android {

    compileSdk = libs.versions.android.compile.get().toInt()

    defaultConfig {
        applicationId = "com.thomaskioko.gradle_catalog"
        minSdk = libs.versions.android.min.get().toInt()
        targetSdk = libs.versions.android.target.get().toInt()
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true
    }


    buildFeatures {
        compose = true
    }

    compileOptions {

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.core.get()
    }

}