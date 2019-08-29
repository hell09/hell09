//package com.hell09.test;
//
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.params.HttpParams;
//import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//
//import com.netflix.client.http.HttpResponse;
//
//import reactor.netty.http.client.HttpClient;
//
///**
// * http client test
// *
// * @author Fayes
// * @date 18-8-9 下午3:00
// */
//public class HttpClientTest {
//
//    private static String doGet(String urlAddress, String token) {
//        HttpGet httpGet = new HttpGet(String.format(urlAddress, token));
//        HttpParams hp = httpGet.getParams();
//        //hp.getParameter("true");
//        hp.setLongParameter("show_sold_out", 2L);
//        hp.setLongParameter("page_no", 1L);
//        hp.setLongParameter("page_size", 300L);
//        HttpClient hc = new DefaultHttpClient();
//        try {
//            HttpResponse ht = hc.execute(httpGet);
//            if (ht.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                HttpEntity he = ht.getEntity();
//                InputStream is = he.getContent();
//                BufferedReader br = new BufferedReader(new InputStreamReader(is));
//                String response = "";
//                String readLine = null;
//                while ((readLine = br.readLine()) != null) {
//                    response = response + readLine;
//                }
//                is.close();
//                br.close();
//                System.out.println("=========" + response);
//                return response;
//            } else {
//                return "error";
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "exception";
//        }
//    }
//
//    private static String doPost(String urlAddress, String token) {
//        //String getUrl = urlAddress + "?username="+username+"&password="+password;
//        HttpPost httpPost = new HttpPost(urlAddress);
//        List<NameValuePair> params = new ArrayList();
//        NameValuePair pair1 = new BasicNameValuePair("show_sold_out", "2");
//        NameValuePair pair2 = new BasicNameValuePair("page_no", "1");
//        NameValuePair pair3 = new BasicNameValuePair("page_size", "300");
//        params.add(pair1);
//        params.add(pair2);
//        params.add(pair3);
//
//        HttpEntity he;
//        try {
//            he = new UrlEncodedFormEntity(params, "UTF-8");
//            httpPost.setEntity(he);
//        } catch (UnsupportedEncodingException e1) {
//            e1.printStackTrace();
//        }
//
//        HttpClient hc = new DefaultHttpClient();
//        try {
//            HttpResponse ht = hc.execute(httpPost);
//            if (ht.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                HttpEntity het = ht.getEntity();
//                InputStream is = het.getContent();
//                BufferedReader br = new BufferedReader(new InputStreamReader(is));
//                String response = "";
//                String readLine = null;
//                while ((readLine = br.readLine()) != null) {
//                    response = response + readLine;
//                }
//                is.close();
//                br.close();
//                System.out.println("=========&&" + response);
//                return response;
//            } else {
//                return "error";
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "exception";
//        }
//    }
//
//
//    public static void main(String[] args) {
//        String server = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search?access_token=%s";
//        String server2 = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search";
//        String token = "c249bb1ad3db3ab687ccc3a4ac087939";
//
//        String getResponse = doGet(server, token);
//        String postResponse = doPost(server2, token);
//
//        System.out.println("getResponse// " + getResponse);
//        System.out.println("postResponse// " + postResponse);
//
//    }
//
//}
