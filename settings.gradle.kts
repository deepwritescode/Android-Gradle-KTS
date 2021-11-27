rootProject.name = "Android Gradle KTS"
enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    /**
     * for more on the version catalog check out the docs
     * https://docs.gradle.org/current/userguide/platforms.html#sub:central-declaration-of-dependencies
     * */
    versionCatalogs {
        create("deps") {
            // dependencies for AndroidX
            version("appCompat", "1.4.0")
            alias("androidx-appcompat-core")
                .to("androidx.appcompat", "appcompat")
                .versionRef("appCompat")
            alias("androidx-constraintlayout")
                .to("androidx.constraintlayout:constraintlayout:2.1.1")
            alias("androidx-core-ktx")
                .to("androidx.core:core-ktx:1.7.0")
            alias("androidx-material")
                .to("com.google.android.material:material:1.4.0")

            // bundle for androidX dependencies
            bundle(
                "androidx",
                listOf(
                    "androidx-appcompat-core",
                    "androidx-constraintlayout",
                    "androidx-core-ktx",
                    "androidx-material"
                )
            )

            // dependencies for kotlin
            version("kotlin", "1.6.0")
            alias("kotlin-stdlib")
                .to("org.jetbrains.kotlin", "kotlin-stdlib-jdk8")
                .versionRef("kotlin")
            alias("kotlin-coroutines")
                .to("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
            bundle("kotlin", listOf("kotlin-stdlib", "kotlin-coroutines"))

            // test dependencies
            alias("test-espresso").to("androidx.test.espresso:espresso-core:3.4.0")
            alias("test-junit-core").to("junit:junit:4.13.2")
            alias("test-junit-ext").to("androidx.test.ext:junit:1.1.3")
            bundle(
                "test", listOf(
                    "test-espresso",
                    "test-junit-core",
                    "test-junit-ext"
                )
            )
        }
    }
}

// here's where you can add other modules if needed
include(":app")
