package com.prashast.formula1.app.service;

import com.prashast.formula1.domain.db.RaceDao;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;


import javax.inject.Inject;
import java.util.List;
import java.util.Map;


public class RaceServiceImpl implements RaceService {

    private final RaceDao dao;
    private final DBI dbi;

    @Inject
    public RaceServiceImpl(final RaceDao dao, final DBI dbi) {
        this.dao = dao;
        this.dbi = dbi;
    }

    /*@Inject
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
    }*/

    /*private Promise<ReceivedResponse> doPost() throws Exception{
        return httpClient.get(new URI("http://ergast.com/api/f1/current/last/results.json"));
    }*/

    public List<Map<String, Object>> getRaces(){
        try(Handle transaction = dbi.open()) {
            return dao.fetchRaces(transaction);
        }
    }

}
