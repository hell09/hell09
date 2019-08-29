package com.hell09.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * http url connection test
 *
 * @author Fayes
 * @date 18-8-9 下午2:59
 */
public class HttpUrlTest {

    private static String doGet(String urlAddress, String token) {
        HttpURLConnection urlConnection;
        URL url;
        try {
            url = new URL(urlAddress);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String response = "";
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                response = response + readLine;
            }
            is.close();
            br.close();
            urlConnection.disconnect();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String doPost(String urlAddress, String token) {
        HttpURLConnection urlConnection;
        URL url;
        try {
            url = new URL(urlAddress);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setUseCaches(false);
            urlConnection.setInstanceFollowRedirects(false);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlConnection.connect();

            DataOutputStream out = new DataOutputStream(urlConnection.getOutputStream());
            String content = "show_sold_out=" + 2 + "&page_no=" + 1 + "page_size" + 300;
            out.writeBytes(content);
            out.flush();
            out.close();

            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String response = "";
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                response = response + readLine;
            }
            is.close();
            br.close();
            urlConnection.disconnect();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        String server = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search?access_token=%s";
        String server2 = "https://open.youzan.com/api/oauthentry/youzan.item/3.0.0/search";
        String token = "c249bb1ad3db3ab687ccc3a4ac087939";

        String getResponse = doGet(server, token);
        String postResponse = doPost(server2, token);

        System.out.println("getResponse// " + getResponse);
        System.out.println("postResponse// " + postResponse);

    }

}
