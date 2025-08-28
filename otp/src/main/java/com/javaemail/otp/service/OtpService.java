package com.javaemail.otp.service;


import com.javaemail.otp.util.OtpUtil;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class OtpService {

    private final EmailService emailService;

    public String sendOtp(String email) throws MessagingException {
        String otp = OtpUtil.generateOtp();
        log.info("The generated otp is " + otp);
        emailService.sendOtpEmail(email, otp);
        return "OTP Sent Sucessfully" + email;
    }





}
