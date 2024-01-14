package com.serviceltp.web.services;


import com.serviceltp.web.models.Algorithm;
import com.serviceltp.web.models.Document;
import com.serviceltp.web.repository.AlgorithmRepository;
import com.serviceltp.web.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlgorithmServiceImpl implements AlgorithmService{
    @Autowired
    private AlgorithmRepository algorithmRepository;
    @Override
    public Algorithm saveAlgorithm(Algorithm algorithm) {
        return algorithmRepository.save(algorithm);
    }
    @Override
    public void updateAlgorithm(Algorithm algorithm, Long algorithmId) {
        Algorithm algDb = algorithmRepository.findById(algorithmId).orElseThrow();
        algDb.setName(algorithm.getName());
        algDb.setDocs(algorithm.getDocs());
        algDb.setObsolete(algorithm.getObsolete());
        algorithmRepository.save(algDb);
    }
    @Override
    public Algorithm findAlgorithmByName(String name) {
        return algorithmRepository.findAlgorithmByName(name);
    }
}
