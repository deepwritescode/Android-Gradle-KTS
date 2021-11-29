import com.shalan.apc.AndroidProjectConfig
import com.shalan.apc.Dependencies.AndroidX
import com.shalan.apc.Dependencies.Kotlin
import com.shalan.apc.Dependencies.Test

plugins {
    id("com.android.application")
    kotlin("android")
    id("com.shalan.androidprojectconfig")
}

android {
    compileSdk = AndroidProjectConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = AndroidProjectConfig.APPLICATION_ID
        minSdk = AndroidProjectConfig.MIN_SDK_VERSION
        targetSdk = AndroidProjectConfig.TARGET_SDK_VERSION
        versionCode = AndroidProjectConfig.VERSION_CODE
        versionName = AndroidProjectConfig.VERSION_NAME

        testInstrumentationRunner = AndroidProjectConfig.TEST_INSTRUMENTATION_RUNNER
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = AndroidProjectConfig.JVM_TARGET
    }
}

dependencies {
    implementation(AndroidX.CoreKtx)
    implementation(AndroidX.AppCompat)
    implementation(AndroidX.Material)
    implementation(AndroidX.ConstraintLayout)

    implementation(Kotlin.Stdlib)
    implementation(Kotlin.Coroutines)

    testImplementation(Test.Junit)

    androidTestImplementation(Test.JunitExt)
    androidTestImplementation(Test.EspressoCore)
}