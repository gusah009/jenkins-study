package com.example.jenkinsstudy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent implements InitializingBean {

    @Override
    public void afterPropertiesSet() {
        System.out.println("컴포넌트 스캔 당하는중~~~");
    }
}
