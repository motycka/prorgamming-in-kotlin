plugins {
    kotlin("jvm")
    id("java")
}

dependencies {
//    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Logging
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")
}


//tasks.test {
//    useJUnitPlatform()
//}

kotlin {
    jvmToolchain(21)
}
