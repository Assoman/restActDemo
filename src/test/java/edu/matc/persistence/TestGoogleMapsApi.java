package edu.matc.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.geocode.Results;
import com.google.geocode.ResultsItem;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGoogleMapsApi {

    @Test
    public void testGoogleApiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://maps.googleapis.com/maps/api/geocode/json?" +
                        "address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=false");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Results results = mapper.readValue(response, Results.class);
        ResultsItem item = results.getResults().get(0);

        assertEquals("37.4224082", item.getGeometry().getLocation().getLat());
    }
}
