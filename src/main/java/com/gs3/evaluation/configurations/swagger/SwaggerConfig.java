package com.gs3.evaluation.configurations.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gs3.evaluation"))
                .paths(PathSelectors.any())
                .build()
                .groupName("Gs3 Tecnologia e Serviços")
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "GS3 Evaluation API",
                "API da avaliação Dev SR",
                "Versão beta-1.0",
                "",
                new Contact("Márcio Lôbo", "https://github.com/mlobo-dev/gs3-backend", "mlobo.dev@gmail.com"),
                "",
                "",
                Collections.emptyList()
        );
    }
}
