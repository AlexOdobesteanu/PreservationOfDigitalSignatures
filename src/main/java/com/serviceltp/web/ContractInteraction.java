package com.serviceltp.web;

import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;

public class ContractInteraction {
    private static ContractInteraction single_instance= null;
//    public ContractGen contractGen;
    public DocumentHash contractGen;

    private ContractInteraction() throws IOException, CipherException {
        Web3j web3j = Web3j.build(
                new HttpService("https://eth-sepolia.g.alchemy.com/v2/LDkYvPZNHLtgJGehWkMfsBbCYlPczoqp"));
        Credentials credentials = WalletUtils.loadCredentials(
                "Alex.2701",
                "./UTC--2024-02-02T21-11-18.24220000Z--a61d5eb54c36f13c2d67bf51cd5c5bb3a6e4b0bd.json");
        DefaultGasProvider df = new DefaultGasProvider();
//        this.contractGen = ContractGen.load("0xDEbF3778d9fa06f5e52483d525217D718c081C42", web3j, credentials, df);
        this.contractGen = DocumentHash.load("0xa9Ea0BEDE9AB6e7e847484b3dcF5d068ad3A970b",web3j, credentials, df);
    }

    public static synchronized ContractInteraction getInstance() throws CipherException, IOException {
        if(single_instance == null) {
            single_instance = new ContractInteraction();
        }
        return single_instance;
    }
}
