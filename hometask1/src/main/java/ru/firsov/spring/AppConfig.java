package ru.firsov.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.firsov.spring")
public class AppConfig {
    @Bean("animalsClassNameGenerator")
    public ClassNameGenerator animalsClassNameGenerator() {
        ClassNameGenerator classNameGenerator = new AnimalsClassNameGenerator();
        return classNameGenerator;
    }

    @Bean("javaCodeCreator")
    public CodeCreator javaCodeCreator() {
        CodeCreator codeCreator = new JavaCodeCreator();
        ((JavaCodeCreator) codeCreator).setClassNameGenerator(animalsClassNameGenerator());
        return codeCreator;
    }

}
