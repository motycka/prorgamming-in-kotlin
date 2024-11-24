//project.ext.apply {
//    set("kotlinVersion", "1.9.21")
//}

plugins {
    kotlin("jvm") version "1.9.21"
    id("io.kotest")
    java
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
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))

        testImplementation(platform("org.junit:junit-bom:5.9.1"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testImplementation("org.jetbrains.kotlin:kotlin-test")
    }

    tasks.test {
        useJUnitPlatform()
    }
}


