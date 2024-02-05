//package com.serviceltp.web.services;
//
//import com.serviceltp.web.ContractGen;
//import com.serviceltp.web.config.ContractProperties;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.tx.ClientTransactionManager;
//import org.web3j.tx.TransactionManager;
//
//import java.math.BigInteger;
//
//public class ContractService {
//    private final String contractAddress;
//    private final Web3j web3j;
//    private final ContractProperties config;
//
//    public ContractService(String contractAddress, Web3j web3j, ContractProperties config) {
//        this.contractAddress = contractAddress;
//        this.web3j = web3j;
//        this.config = config;
//    }
//
//    public TransactionReceipt addUser(int userId) throws Exception
//    {
//        ContractGen myContract = loadContract(contractAddress);
//        return myContract.addUser(BigInteger.valueOf(userId)).send();
//    }
//
//    public TransactionReceipt addUserSubmittedDoc(int userId, int docId) throws Exception
//    {
//        ContractGen myContract = loadContract(contractAddress);
//        return myContract.addUserSubmittedDoc(BigInteger.valueOf(userId), BigInteger.valueOf(userId)).send();
//    }
//
//    public TransactionReceipt getDocumentsIds (int userId) throws Exception
//    {
//        ContractGen myContract = loadContract(contractAddress);
//        return myContract.getDocumentsIds(BigInteger.valueOf(userId)).send();
//    }
//
//    private ContractGen loadContract(String accountAddress) {
//        return ContractGen.load(contractAddress, web3j, txManager(accountAddress), config.gas());
//    }
//    private TransactionManager txManager(String accountAddress)
//    {
//        return new ClientTransactionManager(web3j,accountAddress);
//    }
//}
