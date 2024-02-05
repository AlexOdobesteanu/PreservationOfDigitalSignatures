package com.serviceltp.web.repository;

import com.serviceltp.web.models.Document;
import com.serviceltp.web.models.Trans;
import com.serviceltp.web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransRepository extends JpaRepository<Trans,Long> {
    List<Trans> findByUser(User user);
}
