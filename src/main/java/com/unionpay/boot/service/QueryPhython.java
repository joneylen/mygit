package com.unionpay.boot.service;

import com.alibaba.fastjson.JSON;
import com.unionpay.boot.pojo.OriginTravelData;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 戴草帽的王子
 * @Date: 2020/3/16 17:57
 * @Version 1.0
 */
@Slf4j
@Service
public class QueryPhython {

    //请求处理图片
    public String queryPhythonPicture(byte[] pictureByte) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://172.18.163.210:32315/card/score/");
//        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
//        nvps.add(new BasicNameValuePair("username", "vip"));
        String pictureString = JSON.toJSONString(pictureByte);
//        String pictureString = new String(pictureByte);
        StringEntity entity = new StringEntity(pictureString, "UTF-8");

        // post请求是将参数放在请求体里面传过去的;这里将entity放入post请求体中
        httpPost.setEntity(entity);

        httpPost.setHeader("Content-Type", "application/json;charset=utf8");


        //nvps.add(new BasicNameValuePair("picture", pictureString));
//        httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
        RequestConfig requestConfig = RequestConfig.custom()
                // 设置连接超时时间(单位毫秒)
                .setConnectTimeout(5000)
                // 设置请求超时时间(单位毫秒)
                .setConnectionRequestTimeout(5000)
                // socket读写超时时间(单位毫秒)
                .setSocketTimeout(5000)
                // 设置是否允许重定向(默认为true)
                .setRedirectsEnabled(true).build();
        httpPost.setConfig(requestConfig);
        CloseableHttpResponse response2 = httpclient.execute(httpPost);
        String s = null;
        try {
            log.info(response2.getStatusLine().toString());
            HttpEntity entity2 = response2.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
//            EntityUtils.consume(entity2);
            s = EntityUtils.toString(entity2,"UTF-8");
            return s;
        } finally {
            response2.close();
        }

    }

    //请求处理轨迹
    public String queryPhythonTravel(List<OriginTravelData> list) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://172.18.163.210:31006/v1/login");
        String travelString = JSON.toJSONString(list);
        StringEntity entity = new StringEntity(travelString, "UTF-8");
        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
        RequestConfig requestConfig = RequestConfig.custom()
                // 设置连接超时时间(单位毫秒)
                .setConnectTimeout(5000)
                // 设置请求超时时间(单位毫秒)
                .setConnectionRequestTimeout(5000)
                // socket读写超时时间(单位毫秒)
                .setSocketTimeout(5000)
                // 设置是否允许重定向(默认为true)
                .setRedirectsEnabled(true).build();
        httpPost.setConfig(requestConfig);
        CloseableHttpResponse response2 = httpclient.execute(httpPost);
        String str = null;
        try {
            log.info(response2.getStatusLine().toString());
            HttpEntity entity2 = response2.getEntity();
            str = EntityUtils.toString(entity2,"UTF-8");
            return str;
        } finally {
            response2.close();
        }


    }
}
