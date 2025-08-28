package com.javaemail.otp.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendOtpEmail(String to , String otp) throws MessagingException{

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);

        messageHelper.setTo(to);
        messageHelper.setSubject("OTP Recieved");
        messageHelper.setText("Your Otp is " +otp,true);
        log.info("The message is {} ",message );
        mailSender.send(message);
    }


}
