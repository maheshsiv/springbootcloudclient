package com.example.microservices.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class DataConfiguration {

    private int minimum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    private int maximum;

    @Override
    public String toString() {
        return "dataConfiguration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}
