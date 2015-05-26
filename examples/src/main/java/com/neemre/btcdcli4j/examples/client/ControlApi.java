package com.neemre.btcdcli4j.examples.client;

import java.util.Properties;

import org.apache.http.impl.client.CloseableHttpClient;

import com.neemre.btcdcli4j.examples.util.ResourceUtils;

/**A list of examples demonstrating the use of <i>bitcoind</i>'s control RPCs (via the JSON-RPC API).
 * Calling any of the methods below will cause a short overview (<i>i.e.</i> of the results of the 
 * operation) to be written to {@code stdout}.*/
public class ControlApi {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpProvider = ResourceUtils.getHttpProvider();
		Properties nodeConfig = ResourceUtils.getNodeConfig();
		ApiCalls supportedCalls = new ApiCalls(httpProvider, nodeConfig);
		
		supportedCalls.getInfo();
		supportedCalls.stop();
	}
}