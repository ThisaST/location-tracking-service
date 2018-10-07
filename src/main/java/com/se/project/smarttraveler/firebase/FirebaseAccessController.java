package com.se.project.smarttraveler.firebase;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.firebase.database.FirebaseDatabase;
import com.se.project.smarttraveler.model.Driver;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class FirebaseAccessController {

    public static String generateAccessToken() {

        FileInputStream serviceAccount = null;
        String token = null;


        try {
            serviceAccount = new FileInputStream("/home/malware/Downloads/trackerapplication-1790f-firebase-adminsdk-i1x2e-bff47dc881.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            GoogleCredential googleCredential = GoogleCredential.fromStream(serviceAccount);

            GoogleCredential scoped = googleCredential.createScoped(
                    Arrays.asList(
                            "https://www.googleapis.com/auth/firebase.database",
                            "https://www.googleapis.com/auth/userinfo.email"
                    )
            );

            scoped.refreshToken();
            token = scoped.getAccessToken();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return token;
    }

    public static void getDriverFromFirebaseDatabase() {


    }

    public static void main(String[] args) {

//        FirebaseDatabase database = Fi
        String token = generateAccessToken();

        System.out.println(token);

            /*String uri = "https://trackerapplication-1790f.firebaseio.com//Users/UUoDWMbTL6UmbgEbjjE1iJzJXqw2.json?access_token=" + token;
        *//*RestTemplate restTemplate = new RestTemplate();
        Driver driver = restTemplate.getForObject(uri, Driver.class);
        String name = driver.getDriverName();
        System.out.println(name);

        Map<Long, Driver> driverMap = new HashMap<>();
        driverMap.put(driver.getId(), driver);

        System.out.println(token);*//*


        Timer timer = new Timer();
        RequestScheduler requestScheduler = new RequestScheduler();

        timer.scheduleAtFixedRate(requestScheduler, 0, 10000);*/
    }
}
