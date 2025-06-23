plugins {
    kotlin("jvm") version "2.2.0"
    application
}

group = "wa.umiushi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass = "wa.umiushi.AppKt"
}
tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}