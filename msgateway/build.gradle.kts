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
	implementation("org.springframework.boot:spring-boot-starter-webflux")

	// Spring Cloud Eureka
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")

	// Spring Cloud Gateway
	implementation("org.springframework.cloud:spring-cloud-starter-gateway")

	// For testing
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}