package com.javaemail.otp.util;

import java.util.Random;

public class OtpUtil {


    public static String generateOtp() {
        long otp = 100000 + new Random().nextInt(900000);
        return String.valueOf(otp);
    }
}
