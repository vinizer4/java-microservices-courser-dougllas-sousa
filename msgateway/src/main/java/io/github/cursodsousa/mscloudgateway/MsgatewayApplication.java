package io.github.cursodsousa.mscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
@EnableDiscoveryClient
public class MsgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgatewayApplication.class, args);
	}

	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder
				.routes()
				.route(r -> r.path("/clientes/**")
						.uri("lb://msclientes"))
				.build();
	}

}
