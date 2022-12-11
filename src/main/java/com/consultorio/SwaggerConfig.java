package com.consultorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	// Se agrega la documentacion de la API
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// Se agregan los controladores que existen dentro del paquede "Controller"
				.apis(RequestHandlerSelectors.basePackage("com.consultorio.controller")).paths(PathSelectors.any()).build()
				.apiInfo(getApiInfo());
	}

	@SuppressWarnings("unused")
	// Informaci�n personal para mostrar en la interfaz de Swagger
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder().title("Consultorio").description("APi documentation for Consultorio")
				.contact(new Contact("DianaGarzon", "https://github.com/Dmarcela0", "dianagarzon0513@gmail.com"))
				.version("1.0").build();
	}
}
