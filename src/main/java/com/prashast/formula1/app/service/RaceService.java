package com.prashast.formula1.app.service;

import ratpack.exec.Promise;
import ratpack.http.client.ReceivedResponse;

import java.util.List;
import java.util.Map;

public interface RaceService {

    /*Promise<ReceivedResponse> getValue();*/
    List<Map<String, Object>> getRaces();
    List<Map<String, Object>> getRace(int year);
    List<Map<String, Object>> getRaceYear();
}
