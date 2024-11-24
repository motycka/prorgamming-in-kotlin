//plugins {
//    // Apply the foojay-resolver plugin to allow automatic download of JDKs
//    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
//}

pluginManagement {
    val kotlinVersion = "1.9.21"
    val kotestVersion = "0.4.11"

    plugins {
        kotlin("jvm") version kotlinVersion
        id("io.kotest") version kotestVersion

        // Apply the foojay-resolver plugin to allow automatic download of JDKs
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }

    repositories {
        gradlePluginPortal()
    }
}

rootProject.name = "programming-in-kotlin"
include(
    "m1-kotlin-basics"
//    "m2-java-practice",
//    "m3-spring-application"
)
