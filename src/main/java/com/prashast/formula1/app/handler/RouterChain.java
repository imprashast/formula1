package com.prashast.formula1.app.handler;

import ratpack.func.Action;
import ratpack.handling.Chain;

import javax.inject.Inject;

public class RouterChain implements Action<Chain> {

    private final RaceHandler raceHandler;
    private final RaceYearHandler raceYearHandler;

    @Inject
    public RouterChain(RaceHandler raceHandler, RaceYearHandler raceYearHandler){
        this.raceHandler = raceHandler;
        this.raceYearHandler = raceYearHandler;
    }

    @Override
    public void execute(Chain chain) throws Exception {
        chain.prefix("formula1", path -> path.get("races.json", raceHandler));
        chain.prefix("formula1", path -> path.get("race.json/:year", raceYearHandler));
    }
}
