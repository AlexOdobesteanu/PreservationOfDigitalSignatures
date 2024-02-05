package com.serviceltp.web;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

public class ContractGen extends Contract {
    private static final String BINARY = "608060405234801561000f575f80fd5b5061033d8061001d5f395ff3fe608060405234801561000f575f80fd5b506004361061003f575f3560e01c80638d356fb414610043578063ca69c18f1461006c578063e1d8173614610081575b5f80fd5b610056610051366004610279565b610094565b6040516100639190610290565b60405180910390f35b61007f61007a3660046102d3565b6100f1565b005b61007f61008f366004610279565b610185565b5f81815260208181526040918290208054835181840281018401909452808452606093928301828280156100e557602002820191905f5260205f20905b8154815260200190600101908083116100d1575b50505050509050919050565b5f5b600154811015610164578260018281548110610111576101116102f3565b905f5260205f2090600202015f01540361015c5760018181548110610138576101386102f3565b5f918252602080832060016002909302018201805492830181558352909120018290555b6001016100f3565b505f9182526020828152604083208054600181018255908452922090910155565b60408051808201825282815281515f80825260208083019094528383019182526001805480820182559152825160029091027fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf681019182559151805193949193610216937fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf70192919091019061021c565b50505050565b828054828255905f5260205f20908101928215610255579160200282015b8281111561025557825182559160200191906001019061023a565b50610261929150610265565b5090565b5b80821115610261575f8155600101610266565b5f60208284031215610289575f80fd5b5035919050565b602080825282518282018190525f9190848201906040850190845b818110156102c7578351835292840192918401916001016102ab565b50909695505050505050565b5f80604083850312156102e4575f80fd5b50508035926020909101359150565b634e487b7160e01b5f52603260045260245ffdfea2646970667358221220c6af5a2517ce294229d394cd19b4d07f8c88c9d15e4a1ff43302b66687fe33f264736f6c63430008180033";

    public static final String FUNC_ADDUSER = "addUser";

    public static final String FUNC_ADDUSERSUBMITTEDDOC = "addUserSubmittedDoc";

    public static final String FUNC_GETDOCUMENTSIDS = "getDocumentsIds";

    @Deprecated
    protected ContractGen(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ContractGen(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ContractGen(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ContractGen(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> addUser(BigInteger userId) {
        final Function function = new Function(
                FUNC_ADDUSER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(userId)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addUserSubmittedDoc(BigInteger userId, BigInteger docId) {
        final Function function = new Function(
                FUNC_ADDUSERSUBMITTEDDOC,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(userId),
                new org.web3j.abi.datatypes.generated.Uint256(docId)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> getDocumentsIds(BigInteger userId) {
        final Function function = new Function(
                FUNC_GETDOCUMENTSIDS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(userId)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static ContractGen load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ContractGen(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ContractGen load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ContractGen(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ContractGen load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ContractGen(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractGen load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ContractGen(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ContractGen> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ContractGen.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ContractGen> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ContractGen.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ContractGen> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ContractGen.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ContractGen> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ContractGen.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
