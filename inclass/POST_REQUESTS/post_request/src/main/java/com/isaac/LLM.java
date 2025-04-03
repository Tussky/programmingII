package com.isaac;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


public class LLM {
    public String extractResponse(String json){
        try {
        JSONObject obj = new JSONObject(json);
        return obj.getString("response");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String sendPOST(String [] keys) {
        // Create a new HTTP client instance
        CloseableHttpClient httpClient = HttpClients.createDefault();

        String res = "";
        String url = "http://localhost:11434/api/generate";
        try {
            // Create the POST request method
            HttpPost postRequest = new HttpPost(url);

            // Create a string entity with data to be sent in the request body
            String params = "{\"model\":\"" + keys[0] + "\","
                    + "\"prompt\":\"" + keys[1] + "\","
                    + "\"stream\":" + Boolean.FALSE + "}";
    //            System.out.println("params"+params);
            StringEntity stringEntity = new StringEntity(params);

            // Set the content type of the request to JSON
            postRequest.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");

            // Set the entity for the POST request
            postRequest.setEntity(stringEntity);

            // Execute the request and print the response
            HttpResponse response = httpClient.execute(postRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Status Code: " + statusCode);

            // Get the response entity
            res = EntityUtils.toString(response.getEntity());

        } catch (IOException ex) {
            // Logger.getLogger(ApiRequests.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            // Logger.getLogger(ApiRequests.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close the HTTP client instance
                httpClient.close();
            } catch (IOException ex) {
                // Logger.getLogger(ApiRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }
}