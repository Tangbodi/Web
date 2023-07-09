package com.example.demo.Controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://192.168.1.10:3000/")
public class XmlProxyController {
//    @GetMapping(value = "/rss_xml",produces = "text/plain;charset=UTF-8")
    @GetMapping(value = "/rss_xml",produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> proxyXml() {
//        String rssFeedUrl = "https://rsshub.app/ifeng/news";
        String rssFeedUrl = "https://finance.yahoo.com/rss/topstories";
        try {
                org.apache.http.client.HttpClient httpClient = HttpClientBuilder.create().build();
                HttpGet httpGet = new HttpGet(rssFeedUrl);
                org.apache.http.HttpResponse response = httpClient.execute(httpGet);

                if (response.getStatusLine().getStatusCode() == HttpStatus.OK.value()) {
                    String rssFeed = org.apache.http.util.EntityUtils.toString(response.getEntity(),"UTF-8");
                    return ResponseEntity.ok(rssFeed);
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }

        }
}

