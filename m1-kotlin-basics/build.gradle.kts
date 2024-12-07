plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("idea")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-json")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")
    runtimeOnly("com.h2database:h2")

//    testImplementation(kotlin("test"))
//    testImplementation("org.springframework.boot:spring-boot-test")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("junit:junit")
        exclude("org.mockito:mockito-core")
    }
    testImplementation("io.kotest:kotest-extensions-spring:4.4.3")
//    testImplementation("com.ninja-squad:springmockk:4.0.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
