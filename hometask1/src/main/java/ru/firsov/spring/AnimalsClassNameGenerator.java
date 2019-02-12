package ru.firsov.spring;

public class AnimalsClassNameGenerator implements ClassNameGenerator {
    public String getRandomClassName() {
        String[] names = {"Cat", "Dog", "Horse"};
        return names[(int) (Math.random() * names.length)];
    }
}
