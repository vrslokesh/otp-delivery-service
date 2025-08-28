package com.javaemail.otp.controller;

import com.javaemail.otp.model.OtpRequest;
import com.javaemail.otp.service.OtpService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtpController {

    @Autowired
    private OtpService otpService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody OtpRequest otpRequest){
        return ResponseEntity.ok("User Registered" + otpRequest.getEmail());
    }

    @PostMapping("/sendotp")
    public ResponseEntity<String> sendOtp(@RequestBody OtpRequest otpRequest) throws MessagingException {
        otpService.sendOtp(otpRequest.getEmail());
        return ResponseEntity.ok("OTP sent sucessfully to " + otpRequest.getEmail());
    }


}
