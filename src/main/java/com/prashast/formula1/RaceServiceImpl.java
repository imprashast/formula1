package com.prashast.formula1;

import ratpack.exec.Promise;
import ratpack.http.Status;
import ratpack.http.client.HttpClient;
import ratpack.http.client.ReceivedResponse;


import javax.inject.Inject;
import java.io.IOException;
import java.net.URI;


public class RaceServiceImpl implements RaceService {


    private final HttpClient httpClient;

    @Inject
    RaceServiceImpl(HttpClient httpClient){
        this.httpClient = httpClient;
    }

    public Promise<ReceivedResponse> getValue() {
        Promise<ReceivedResponse> response ;
        try {
            System.out.println("Trying");
            response = doPost();
            response.then(receivedResponse ->  receivedResponse.getBody().getText());
            return response.map(this::extract);

        }catch (Exception e){
            System.out.println("Exception"+e);
            e.printStackTrace();
        }
        response=null;
        return response;
    }

    private ReceivedResponse extract(ReceivedResponse response) {
        if (Status.OK.getCode() == response.getStatus().getCode()) {
            try {
                System.out.println(response.getBody().getText());
                return response;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new RuntimeException("Could not get response from postal code API. Got response code" + response.getStatusCode());
        }
    }

    private Promise<ReceivedResponse> doPost() throws Exception{
        return httpClient.get(new URI("http://ergast.com/api/f1/current/last/results.json"));
    }

}
