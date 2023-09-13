plugins {
    java
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "io.github.cursodsousa"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2022.0.1")
    }
}

dependencies {
    // Spring Boot Starter Web
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Boot Starter Data JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Spring Cloud Eureka
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

    // Spring Boot Devtools
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // H2 Database
    runtimeOnly("com.h2database:h2")

    // For testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}