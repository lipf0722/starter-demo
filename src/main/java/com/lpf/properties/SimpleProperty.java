package com.lpf.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "simple")
@Data
public class SimpleProperty {
    private String name;
    private String height;
}
