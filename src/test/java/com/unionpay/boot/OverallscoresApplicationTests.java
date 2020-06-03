package com.unionpay.boot;

import com.alibaba.fastjson.JSON;
import com.unionpay.boot.util.SFTPUtil;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
class OverallscoresApplicationTests {

    @Test
   public void testone() throws Exception {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("http://www.baidu.com");
//        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
//        nvps.add(new BasicNameValuePair("username", "vip"));
            String pictureString = JSON.toJSONString("aaaa");
//        String pictureString = new String(pictureByte);
            StringEntity entity = new StringEntity(pictureString, "UTF-8");

            // post请求是将参数放在请求体里面传过去的;这里将entity放入post请求体中
            httpPost.setEntity(entity);

            httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");


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
                System.out.println((response2.getStatusLine().toString()));
                HttpEntity entity2 = response2.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
//            EntityUtils.consume(entity2);
                s = EntityUtils.toString(entity2,"UTF-8");
                System.out.println(s);
            } finally {
                response2.close();
            }
    }


    @Test
    public  void testSftp() throws Exception {
        SFTPUtil sftp = new SFTPUtil("admin", "123456", "192.168.1.8", 22);
        sftp.login();

        //上传文件测试
		/*File file = new File("F://PornHub//ceshi.rtf");
		InputStream is = new FileInputStream(file);
		sftp.upload("/upload","code", "ceshi.rtf", is);
		sftp.logout();*/

        //下载文件测试
        byte[] bytes = sftp.download("/upload/code", "ceshi.rtf");
        sftp.logout();



    }
    @Test
    public  void testValue(){
    }



    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
                tomcat.enableNaming();
                return super.getTomcatWebServer(tomcat);
            }
            @Override
            protected void postProcessContext(Context context) {
                ContextResource resource = new ContextResource();
                resource.setName("jdbc/mydb");
                resource.setType(DataSource.class.getName());
                resource.setProperty("driverClassName", "com.mysql.jdbc.Driver");
                resource.setProperty("url", "jdbc:mysql://localhost:3306/tsdb");
                resource.setProperty("username", "root");
                resource.setProperty("password","123456");
                context.getNamingResources().addResource(resource);
                super.postProcessContext(context);
            }
        };
        return tomcat;
    }



    @Test
    public void doPostTestOne() {

        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 创建Post请求
        HttpPost httpPost = new HttpPost("http://localhost:12345/doPostControllerOne");
        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}



