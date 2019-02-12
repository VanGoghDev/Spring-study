package ru.firsov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedSimpleBean {
    @Autowired
    private ClassNameGenerator classNameGenerator;

    public ClassNameGenerator getClassNameGenerator() {
        return classNameGenerator;
    }

    @Autowired
    public void setClassNameGenerator(ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    private String data;

    public String getData() { return data;}

    public void setData(String data) {this.data = data;}

    public void printRandomClassName() {
        System.out.println(classNameGenerator.getRandomClassName());
    }
}
