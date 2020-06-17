package fr.loicmathieu.quickperf;

import io.quarkus.runtime.Quarkus;

public class JavaMain {
    public static void main(String... args) {
        Quarkus.run(ExampleMain.class, args);
    }
}
