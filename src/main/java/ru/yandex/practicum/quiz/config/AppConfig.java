package ru.yandex.practicum.quiz.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring-quiz")
@Setter
@Getter
@ToString
public class AppConfig {
    private String title;
}
