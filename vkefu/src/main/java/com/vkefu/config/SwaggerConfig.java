package com.vkefu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.vkefu.webim.web")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo(
                "SpringMVC REST API文档:http://localhost:8080/swagger-ui.html",
                "使用Swagger UI构建SpringMVC REST风格的可视化文档",
                "1.0.0-SNAPSHOT",
                "http://localhost:8080/SpringMVC/v2/api-docs",
                "clocm",
                "Apache License",
                "http://www.apache.org/licenses/LICENSE-2.0.html");
        return apiInfo;
    }
}
