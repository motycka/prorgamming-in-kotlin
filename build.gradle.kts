import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

//project.ext.apply {
//    set("kotlinVersion", "1.9.21")
//}

plugins {
    kotlin("jvm")
//    kotlin("plugin.spring")
    id("io.kotest")
//    id("org.jetbrains.kotlinx.kover")
//    id("maven-publish")
//    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    jvmToolchain(21)
}

buildscript {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "io.kotest")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))

//        testImplementation(platform("org.junit:junit-bom:5.9.1"))
//        // testImplementation(platform("io.kotest:kotest-bom:5.4.2"))
////        testImplementation(platform("io.kotest:kotest-bom:4.6.3"))
////        testImplementation("org.junit.jupiter:junit-jupiter")
////        testImplementation("org.jetbrains.kotlin:kotlin-test")
//        testImplementation(kotlin("test"))
//
//        testImplementation("io.kotest:kotest-runner-junit5")
//        testImplementation("io.kotest:kotest-assertions-core")
//        testImplementation("io.mockk:mockk:1.13.2")

        // testImplementation(platform("io.kotest:kotest-bom:5.4.2"))
        testImplementation(platform("io.kotest:kotest-bom:4.6.3"))
        testImplementation("io.kotest:kotest-runner-junit5")
        testImplementation("io.kotest:kotest-assertions-core")
        testImplementation("io.mockk:mockk:1.13.2")
    }

    tasks.withType<Test> {
        useJUnitPlatform()

        testLogging {
            events("passed", "skipped", "failed")
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
}


