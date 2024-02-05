package com.serviceltp.web;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;
import org.web3j.tx.gas.DefaultGasProvider;


import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;

@SpringBootApplication
//@EnableScheduling
public class WebApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
//		Web3j web3j = Web3j.build(
//				new HttpService("https://eth-sepolia.g.alchemy.com/v2/LDkYvPZNHLtgJGehWkMfsBbCYlPczoqp"));
//		Credentials credentials = WalletUtils.loadCredentials(
//				"Alex.2701",
//				"./UTC--2024-02-02T21-11-18.24220000Z--a61d5eb54c36f13c2d67bf51cd5c5bb3a6e4b0bd.json");
////		ContractGen contr = ContractGen.deploy(web3j,credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT).send();
//		DefaultGasProvider df = new DefaultGasProvider();
//		ContractGen contr2 = ContractGen.load("0xDEbF3778d9fa06f5e52483d525217D718c081C42", web3j, credentials, df);
//		String contractAddress = contr.getContractAddress(); //0x62da16e256cf0968e26e8700cf3a95b26ab1cb6a741272be851e47f4c3cac77b
//		System.out.println(contractAddress);
	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@GetMapping("/")
	public String index()
	{
		return "index";
	}


}
