package com.backend.springBackEnd

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Создаем конфигурацию для ядра чтобы приложение могло Принимать запросы по
 * нескольким портам. Для этого делаем оверрайд на метод {@code addCorsMapping},
 * где всем директориям от корня registry.addMapping("") мы добавляем
 * начало с помощью метода .allowedOrigins("начало", "начало" и т.д.).
 * Это будет применено по умолчанию!
 */
@Configuration
@EnableWebMvc
class WebConfig: WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:8080")
    }
}