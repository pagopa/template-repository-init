package it.gov.pagopa.template.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Configuration;

/**
 * The Class SwaggerConfig.
 */
@Configuration
@OpenAPIDefinition(
  info = @io.swagger.v3.oas.annotations.info.Info(
    title = "${spring.application.name}",
    version = "${spring.application.version}",
    description = "Api and Models"
  )
)
public class SwaggerConfig {
}
