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

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.3.0.
 */
public class DocumentHash extends Contract {
    private static final String BINARY = "608060405234801561000f575f80fd5b5061033d8061001d5f395ff3fe608060405234801561000f575f80fd5b506004361061003f575f3560e01c806324242776146100435780638d356fb414610058578063e1d8173614610081575b5f80fd5b610056610051366004610279565b610094565b005b61006b610066366004610299565b610128565b60405161007891906102b0565b60405180910390f35b61005661008f366004610299565b610185565b5f5b6001548110156101075782600182815481106100b4576100b46102f3565b905f5260205f2090600202015f0154036100ff57600181815481106100db576100db6102f3565b5f918252602080832060016002909302018201805492830181558352909120018290555b600101610096565b505f9182526020828152604083208054600181018255908452922090910155565b5f818152602081815260409182902080548351818402810184019094528084526060939283018282801561017957602002820191905f5260205f20905b815481526020019060010190808311610165575b50505050509050919050565b60408051808201825282815281515f80825260208083019094528383019182526001805480820182559152825160029091027fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf681019182559151805193949193610216937fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf70192919091019061021c565b50505050565b828054828255905f5260205f20908101928215610255579160200282015b8281111561025557825182559160200191906001019061023a565b50610261929150610265565b5090565b5b80821115610261575f8155600101610266565b5f806040838503121561028a575f80fd5b50508035926020909101359150565b5f602082840312156102a9575f80fd5b5035919050565b602080825282518282018190525f9190848201906040850190845b818110156102e7578351835292840192918401916001016102cb565b50909695505050505050565b634e487b7160e01b5f52603260045260245ffdfea2646970667358221220979a243f0d8508922be988f49fd7c2c3e6487a1c66c44ef66522a8f7c0fe419e64736f6c63430008180033";

    public static final String FUNC_ADDUSER = "addUser";

    public static final String FUNC_ADDUSERSUBMITTEDDOC = "addUserSubmittedDoc";

    public static final String FUNC_GETDOCUMENTSIDS = "getDocumentsIds";

    @Deprecated
    protected DocumentHash(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DocumentHash(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected DocumentHash(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected DocumentHash(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> addUser(BigInteger userId) {
        final Function function = new Function(
                FUNC_ADDUSER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(userId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addUserSubmittedDoc(BigInteger userId, byte[] docHash) {
        final Function function = new Function(
                FUNC_ADDUSERSUBMITTEDDOC, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(userId), 
                new org.web3j.abi.datatypes.generated.Bytes32(docHash)), 
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
    public static DocumentHash load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DocumentHash(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static DocumentHash load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DocumentHash(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static DocumentHash load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new DocumentHash(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DocumentHash load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new DocumentHash(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<DocumentHash> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DocumentHash.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DocumentHash> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DocumentHash.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<DocumentHash> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DocumentHash.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DocumentHash> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DocumentHash.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
