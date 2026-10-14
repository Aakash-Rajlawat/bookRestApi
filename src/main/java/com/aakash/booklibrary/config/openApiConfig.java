package com.aakash.booklibrary.config;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class openApiConfig
{

    @Bean

    public OpenAPI customOpenAPI() {

        return new OpenAPI()

                .info(new Info()

                        .title("Book Library API")

                        .version("1.0.0")

                        .description("REST API for managing books"));

    }
}
