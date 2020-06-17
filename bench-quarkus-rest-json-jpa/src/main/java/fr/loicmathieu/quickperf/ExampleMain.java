package fr.loicmathieu.quickperf;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@QuarkusMain
public class ExampleMain implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        return 0;
    }
}
