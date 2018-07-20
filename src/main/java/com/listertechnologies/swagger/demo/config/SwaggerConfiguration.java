package com.listertechnologies.swagger.demo.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Online store", "Spring Boot REST API for Online Store", "1.0",
				"Terms of service",
				new Contact("Lister Technologies", "https://www.listertechnologies.com/",
						"contact@listertechnologies.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
		return apiInfo;
	}
}
