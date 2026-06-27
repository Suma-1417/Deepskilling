package com.suma.mockito;

public class MyService {

    private final Dependency dependency;

    public MyService(Dependency dependency) {
        this.dependency = dependency;
    }

    public String process() {
        return "Processed: " + dependency.getData();
    }
}
