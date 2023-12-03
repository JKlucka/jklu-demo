plugins {
    java
    kotlin("jvm") version "1.5.31"
}

allprojects {
    group = "com.jklu.demo"
    version = "0.0.1"

    repositories {
        mavenCentral()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


