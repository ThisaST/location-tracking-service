package com.se.project.smarttraveler.firebase;

import com.se.project.smarttraveler.model.Driver;
import com.se.project.smarttraveler.model.Location;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.TimerTask;

public class RequestScheduler extends TimerTask{

    private String authenticationToken;
    private String resourceUri = "";
    private RestTemplate restTemplate = new RestTemplate();

    public RequestScheduler() {

        authenticationToken = FirebaseAccessController.generateAccessToken();

    }

    @Override
    public void run() {

        resourceUri = "https://trackerapplication-1790f.firebaseio.com/locations/123.json";

        getLocation(resourceUri);

        /*try {

            resourceUri = "https://trackerapplication-1790f.firebaseio.com/locations/123.json";
            *//*Driver newDriver = restTemplate.getForObject(resourceUri, Driver.class);*//*

            Location busLocation = new Location();

            ResponseEntity<List<Location>> rateResponse =
                    restTemplate.exchange(resourceUri,
                            HttpMethod.GET, null, new ParameterizedTypeReference<List<Location>>() {
                            });
            List<Location> rates = rateResponse.getBody();

            for(Location location : rates) {
                System.out.println(location.getLatitude());
            }

        }catch (Exception e) {


        }*/
    }

    private void getLocation(String resourceUri)
    {

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(resourceUri, String.class);

        System.out.println(result);
    }
}
