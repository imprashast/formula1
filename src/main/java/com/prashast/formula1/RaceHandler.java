package com.prashast.formula1;

import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RaceHandler implements Handler {

    private final RaceService raceService;

    @Inject
    public RaceHandler(RaceService raceService){
        this.raceService = raceService;
    }

    @Override
    public void handle(Context context) {
        //context.render("service value: " + raceService.getValue());
        raceService.getValue().then(t -> context.render(t.getBody().getText()));
    }
}
