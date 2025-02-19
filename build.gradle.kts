plugins {
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
    sourceSets {
        getByName("main") {
            kotlin.srcDir("src/main/kotlin/problems")
        }
    }
}
