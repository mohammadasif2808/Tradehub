package in.co.mohammadasif.tradehub.service;

import in.co.mohammadasif.tradehub.modal.TwoFactorOTP;
import in.co.mohammadasif.tradehub.modal.User;

public interface TwoFactorOtpService {

    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);

}
