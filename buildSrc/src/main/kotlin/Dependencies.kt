object Dependencies {

    object Kotlin {
        const val Stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
    }

    object AndroidX {
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val CoreKtx = "androidx.core:core-ktx:1.7.0"
        const val Material = "com.google.android.material:material:${Versions.material}"
    }

    object Test {
        const val EspressoCore = "androidx.test.espresso:espresso-core:3.4.0"

        const val Junit = "junit:junit:4.13.2"
        const val JunitExt = "androidx.test.ext:junit:1.1.3"
    }
}