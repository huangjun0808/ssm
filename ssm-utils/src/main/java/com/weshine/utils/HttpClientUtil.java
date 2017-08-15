package com.weshine.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.alibaba.fastjson.JSONObject;

/**
 * HttpClient工具类
 */
public class HttpClientUtil {

    /**
     * GET请求
     * @param url
     * @return
     */
    public static String httpGet(String url){
        String strResult = doHttp(url,null);
        return strResult;
    }

    /**
     * POST请求
     * @param url
     * @param param
     * @return
     */
    public static JSONObject httpPost(String url,JSONObject param){
        String strResult = doHttp(url,param);
        return JSONObject.parseObject(strResult);
    }

    /**
     * POST请求
     * @param url
     * @param param
     * @return
     */
    public static String httpPost(String url,String param){
        String strResult = doHttp(url,param);
        return strResult;
    }

    /**
     * 公共请求
     * @param url
     * @param param
     * @return
     */
    private static String doHttp(String url,Object param){
        String strResult = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpRequestBase httpRequestBase;
        if(param == null || param.equals("")){
            // 发送get请求
            HttpGet httpRequest = new HttpGet(url);
            // 设置请求和传输超时时间
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(2000).setConnectTimeout(2000).build();
            httpRequest.setConfig(requestConfig);
            httpRequestBase = httpRequest;
        }else{
            HttpPost httpRequest = new HttpPost(url);
            // 设置请求和传输超时时间
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(2000).setConnectTimeout(2000).build();
            httpRequest.setConfig(requestConfig);
            // 解决中文乱码问题
            if(param instanceof String){
                StringEntity entity = new StringEntity((String) param,"utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/x-www-form-urlencoded");
                httpRequest.setEntity(entity);
            }else if (param instanceof JSONObject){
                StringEntity entity = new StringEntity(param.toString(),
                        "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                httpRequest.setEntity(entity);
            }
            httpRequestBase = httpRequest;
        }
        try {
            CloseableHttpResponse response = httpClient.execute(httpRequestBase);
            //请求发送成功，并得到响应
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //读取服务器返回过来的json字符串数据
                HttpEntity entity = response.getEntity();
                strResult = EntityUtils.toString(entity, "utf-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            httpRequestBase.releaseConnection();
        }
        return strResult;
    }

    public static void main(String[] args) {
        //TODO 测试代码
        String url1 = "http://api.guokunjiankangkeji.com/user/send.do?mobile=18651039625";
        String url2 = "http://api.guokunjiankangkeji.com/user/login.do?mobile=18651039625&code=932697";
        Map<String,String> map = new HashMap<String, String>();
        map.put("mobile","18651039625");
        String result = HttpClientUtil.httpGet(url1);
        System.out.println(result);
    }
}