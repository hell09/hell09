//package com.hell09.test;
//
//import org.apache.http.Consts;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.entity.StringEntity;
//import org.apache.logging.log4j.util.Strings;
//import org.json.simple.JSONObject;
//
//import com.alibaba.fastjson.JSON;
//import com.rabbitmq.client.AMQP.Access.Request;
//import com.sun.xml.messaging.saaj.packaging.mime.internet.ContentType;
//
///**
// * fluent http client test
// *
// * @author Fayes
// * @date 18-8-9 上午11:40
// */
//public class HttpDm {
//
//    /**
//     * fluent hc get request
//     */
//    private static String getFluentResponse(String urlAddress, String token) {
//        String response = null;
//        try {
//            URIBuilder builder = new URIBuilder(urlAddress);
//            builder.setParameter("access_token", token);
//            builder.setParameter("show_sold_out", "2");
//            builder.setParameter("page_no", "1");
//            builder.setParameter("page_size", "300");
//            response = Request.Get(builder.build()).connectTimeout(3000).socketTimeout(3000).execute().returnContent().asString(Consts.UTF_8);
//            if (!Strings.isNullOrEmpty(response)) {
//                JSONObject responseJson = JSONObject.parseObject(response);
//
//                System.out.println(response);
//
//                String status = responseJson.getString("code");
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return response;
//    }
//
//    /**
//     * fluent hc post request
//     */
//    private static String postFluentResponse(String urlAddress, String token) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("show_sold_out", 2);
//        jsonObject.put("page_no", 1);
//        jsonObject.put("page_size", 300);
//        String response = null;
//        try {
//            StringEntity entity = new StringEntity(JSON.toJSONString(jsonObject), ContentType.APPLICATION_JSON);
//            response = Request.Post(String.format(urlAddress, token)).body(entity).connectTimeout(3000).socketTimeout(3000).execute().returnContent().asString(Consts.UTF_8);
//            if (!Strings.isNullOrEmpty(response)) {
//                JSONObject responseJson = JSONObject.parseObject(response);
//
//                System.out.println(response);
//
//                String status = responseJson.getString("code");
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return response;
//    }
//
//
//    public static void main(String[] args) {
//        String server = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search?access_token=%s";
//        String server2 = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search";
//        String token = "c249bb1ad3db3ab687ccc3a4ac087939";
//
//        String getResponse = getFluentResponse(server, token);
//        String postResponse = postFluentResponse(server2, token);
//
//        System.out.println("getResponse// " + getResponse);
//        System.out.println("postResponse// " + postResponse);
//
//    }
//
//}
