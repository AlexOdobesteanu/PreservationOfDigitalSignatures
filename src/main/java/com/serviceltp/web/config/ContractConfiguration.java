//package com.serviceltp.web.config;
//
//
//import com.serviceltp.web.ContractGen;
//import com.serviceltp.web.services.ContractService;
//import okhttp3.OkHttpClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.StringUtils;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.ClientTransactionManager;
//import org.web3j.tx.TransactionManager;
//
//@Configuration
//public class ContractConfiguration {
//    @Value("${contract.owner-address}")
//    private String ownerAddress;
//
//    @Value("${web3j.client-address}")
//    private String clientAddress;
//
//    @Autowired
//    private ContractProperties config;
//
//    @Bean
//    public Web3j web3j() {
//        return Web3j.build(new HttpService(clientAddress, new OkHttpClient.Builder().build()));
//    }
//
//    @Bean
//    public ContractService contract(Web3j web3j, @Value("${contract.address:}") String contractAddress)
//            throws Exception {
//        if (StringUtils.isEmpty(contractAddress)) {
//            System.out.println("Deployed new contract with address '{}'");
//            ContractGen myContract = deployContract(web3j);
//            System.out.println("Deployed new contract with address '{ssss}'");
//
//            return initContractService(myContract.getContractAddress(), web3j);
//        }
//
//        return initContractService(contractAddress, web3j);
//    }
//
//    private ContractService initContractService(String contractAddress, Web3j web3j) {
//        return new ContractService(contractAddress, web3j, config);
//    }
//
//    private ContractGen deployContract(Web3j web3j) throws Exception {
//        ContractGen myContract = ContractGen.deploy(web3j, txManager(web3j), config.gas()).send();
//        System.out.println("Deployed new contract with address '{zzzzzzzzz}'" + myContract.getContractAddress());
//        return myContract;
//    }
//
//    private TransactionManager txManager(Web3j web3j) {
//        return new ClientTransactionManager(web3j, ownerAddress);
//    }
//
//}
