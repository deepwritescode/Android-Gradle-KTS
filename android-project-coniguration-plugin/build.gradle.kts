plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

allprojects {
    group = "com.shalan.androidprojectconfig"
    version = "1.0.0"
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("androidprojectconfiguration"){
            id = group.toString()
            implementationClass = "com.shalan.apc.AndroidProjectConfigurationPlugin"
        }
    }
}