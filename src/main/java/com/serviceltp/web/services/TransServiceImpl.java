package com.serviceltp.web.services;

import com.serviceltp.web.models.Trans;
import com.serviceltp.web.models.User;
import com.serviceltp.web.repository.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransServiceImpl implements TransService {
    @Autowired
    private TransRepository transRepository;

    @Override
    public Trans saveTrans(Trans tr) {
        return transRepository.save(tr);
    }

    @Override
    public List<Trans> getAllByUser(User user) {
        return transRepository.findByUser(user);
    }

    @Override
    public List<Trans> getBycustom(String id)
    {
        List<Trans> full = transRepository.findAll();


        for (Trans tr: full) {
            if(String.valueOf(tr.getUser().getId()) != id)
            {
                full.remove(tr);
            }
        }
        System.out.println(full.size());
        return full;
    }

    @Override
    public List<Trans> getAll() {
        return transRepository.findAll();
    }
}
