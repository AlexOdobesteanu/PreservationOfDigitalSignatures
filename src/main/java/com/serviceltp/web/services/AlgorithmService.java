package com.serviceltp.web.services;

import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Document;

public interface AlgorithmService {
    Algorithm saveAlgorithm(Algorithm algorithm);
    void updateAlgorithm(Algorithm algorithm, Long algorithmId);
    Algorithm findAlgorithmByName(String name);
}
