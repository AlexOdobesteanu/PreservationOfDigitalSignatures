package com.serviceltp.web.services;

import com.serviceltp.web.models.Document;
import com.serviceltp.web.models.Trans;
import com.serviceltp.web.models.User;

import java.util.List;

public interface TransService {
    Trans saveTrans(Trans tr);
    List<Trans> getAllByUser(User user);
    List<Trans> getBycustom(String id);
    List<Trans> getAll();
}
