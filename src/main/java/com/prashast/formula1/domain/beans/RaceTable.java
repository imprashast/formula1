package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RaceTable
{
    private String season;

    private String round;

    private Races[] Races;

    public String getSeason ()
    {
        return season;
    }

    public void setSeason (String season)
    {
        this.season = season;
    }

    public String getRound ()
    {
        return round;
    }

    public void setRound (String round)
    {
        this.round = round;
    }

    public Races[] getRaces ()
    {
        return Races;
    }

    public void setRaces (Races[] Races)
    {
        this.Races = Races;
    }

    @JsonCreator
    public RaceTable(@JsonProperty("season") String season,@JsonProperty("round") String round,@JsonProperty("Races") Races[] races) {
        this.season = season;
        this.round = round;
        Races = races;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [season = "+season+", round = "+round+", Races = "+Races+"]";
    }
}