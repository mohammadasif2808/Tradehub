package in.co.mohammadasif.tradehub.modal;

import in.co.mohammadasif.tradehub.domain.VERIFICATION_TYPE;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwoFactorAuth {
    private Boolean isEnabled = false;
    private VERIFICATION_TYPE sendTo;

}
