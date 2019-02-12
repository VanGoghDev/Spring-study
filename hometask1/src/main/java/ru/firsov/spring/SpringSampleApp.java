package ru.firsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSampleApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        simpleBean.setData("Java");
        System.out.println(simpleBean.getData());

        JavaCodeCreator javaCC = context.getBean("javaCodeCreator", JavaCodeCreator.class);
        System.out.println(javaCC.getClassExample());

        AnnotatedSimpleBean annotatedSimpleBean = context.getBean("annotatedSimpleBean", AnnotatedSimpleBean.class);
        annotatedSimpleBean.setData("A");
        System.out.println(annotatedSimpleBean.getData());
        annotatedSimpleBean.printRandomClassName();

        context.close();
    }
}
