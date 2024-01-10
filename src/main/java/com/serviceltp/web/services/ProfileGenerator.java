package com.serviceltp.web.services;

import com.serviceltp.web.base.PresProfileType;

import java.net.URISyntaxException;
import java.text.ParseException;

public abstract class ProfileGenerator {
    public abstract PresProfileType getProfile(String type) throws URISyntaxException, ParseException;
}
