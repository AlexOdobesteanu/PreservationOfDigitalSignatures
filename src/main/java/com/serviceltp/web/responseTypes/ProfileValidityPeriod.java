package com.serviceltp.web.responseTypes;

import java.util.Date;

public class ProfileValidityPeriod {
    private Date ValidFrom;
    private Date ValidUntil;


    public ProfileValidityPeriod(Date validFrom, Date validUntil) {
        ValidFrom = validFrom;
        ValidUntil = validUntil;
    }

    public Date getValidFrom() {
        return ValidFrom;
    }

    public void setValidFrom(Date validFrom) {
        ValidFrom = validFrom;
    }

    public Date getValidUntil() {
        return ValidUntil;
    }

    public void setValidUntil(Date validUntil) {
        ValidUntil = validUntil;
    }
}
