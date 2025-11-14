package com.producer.room.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.producer.room.configs.OpenApiDescriptionsConstants.*;


@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI gateProducerAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_NAME)
                        .description(API_DESCRIPTION)
                        .version(API_VERSION)
                );
    }

}
