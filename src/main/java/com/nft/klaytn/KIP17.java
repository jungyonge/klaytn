package com.nft.klaytn;

import xyz.groundx.caver_ext_kas.CaverExtKAS;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiException;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.kip17.model.Kip17DeployResponse;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.kip17.model.Kip17TransactionStatusResponse;


public class KIP17 {
    public static void deployKip17() throws ApiException {

        String secretAccessKey = "uKW5Tlt5hwSdtgoXEn_TLrbHWRuQk5nsCHI_4YAv";
        String accessKeyId = "KASKBN95RYGDC5OZEAIZUTFD";
        String chainId = "1001";
        CaverExtKAS caver = new CaverExtKAS(chainId, accessKeyId, secretAccessKey);

        String operatorID = "operatorId";

        String name = "ddong";
        String symbol = "DD";
        String alias = "ddong-blog-test";
        Kip17DeployResponse res = caver.kas.kip17.deploy(name, symbol, alias);
        System.out.println(res);
    }

    public static void main(String[] args) throws ApiException {
        deployKip17();
    }
}