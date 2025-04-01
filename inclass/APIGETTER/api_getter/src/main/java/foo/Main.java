package foo;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException{
        // System.out.println("Hello world!");

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpGet httpget = new HttpGet("https://opentdb.com/api.php");


        URI uri = new URIBuilder(httpget.getURI()).addParameter(" amount", "10")
                                                .addParameter("category", "20")     
                                                .addParameter("difficulty", "easy")
                                                .addParameter("type", "multiple")
                                                .build();
        // https://opentdb.com/api.php?amount=10&category=20&difficulty=easy&type=multiple
        httpget.setURI(uri);

        ResponseHandler<String> responseHandler = (org.apache.http.HttpResponse hr) -> {
            int status = hr.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300){
                HttpEntity entity = hr.getEntity();
                return entity != null ? EntityUtils.toString(entity) : null;
            } else {
                throw new ClientProtocolException("Unexpected response status: "+status);
            }
        };

        String responseBody = "";
        responseBody = httpclient.execute(httpget, responseHandler);
        System.out.println(responseBody);

        JSONObject json = new JSONObject(responseBody);
        JSONArray questions = json.getJSONArray("results");

        for (int i = 0; i < questions.length(); i++) {
            JSONObject question = questions.getJSONObject(i);
            System.out.println(question.getString("question"));
        }

    }
}