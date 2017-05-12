package com.prashast.formula1.app.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prashast.formula1.app.service.RaceService;
import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

import static ratpack.jackson.Jackson.json;

@Singleton
public class RaceHandler implements Handler {

    private final RaceService raceService;
    private final ObjectMapper mapper;

    @Inject
    public RaceHandler(RaceService raceService,ObjectMapper mapper){
        this.raceService = raceService;
        this.mapper = mapper;
    }

    @Override
    public void handle(Context context) {

        context.render(json(raceService.getRaces()));
    }


}
