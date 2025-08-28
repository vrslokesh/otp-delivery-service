package com.javaemail.otp.config;

import lombok.Getter;

import org.springframework.stereotype.Component;

@Component
@Getter
public class MailConfig {

    private String name;
    private String email;
}
