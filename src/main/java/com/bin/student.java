package com.bin;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by  bin
 * Time： 2017/11/21.
 */
@Component
@ConfigurationProperties(prefix = "student")
public class student {
    private String age;
    private String height;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
