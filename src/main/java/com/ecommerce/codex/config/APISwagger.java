package com.ecommerce.codex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class APISwagger {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.ecommerce.codex.controller")) 
            .paths(PathSelectors.any())
            .build()
            .apiInfo(new ApiInfoBuilder()
                .title("E-commerce for codex")
                .description("Documentation for the API of codex's E-commerce")
                .version("1.0")
                .build());
    }
}
