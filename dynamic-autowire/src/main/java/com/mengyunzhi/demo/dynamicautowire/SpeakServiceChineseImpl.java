package com.mengyunzhi.demo.dynamicautowire;

import org.springframework.stereotype.Component;

@Component
public class SpeakServiceChineseImpl implements SpeakService {
    @Override
    public void sayHello() {
        System.out.println("您好");
    }

    @Override
    public Byte getCode() {
        return CountryCode.CHINA.getCode();
    }
}