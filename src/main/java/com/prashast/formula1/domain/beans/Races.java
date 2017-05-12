package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Races
{
    private Circuit Circuit;

    private String time;

    private String season;

    private String raceName;

    private String round;

    private Results[] Results;

    private String date;

    private String url;

    public Circuit getCircuit ()
    {
        return Circuit;
    }

    public void setCircuit (Circuit Circuit)
    {
        this.Circuit = Circuit;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getSeason ()
    {
        return season;
    }

    public void setSeason (String season)
    {
        this.season = season;
    }

    public String getRaceName ()
    {
        return raceName;
    }

    public void setRaceName (String raceName)
    {
        this.raceName = raceName;
    }

    public String getRound ()
    {
        return round;
    }

    public void setRound (String round)
    {
        this.round = round;
    }

    public Results[] getResults ()
    {
        return Results;
    }

    public void setResults (Results[] Results)
    {
        this.Results = Results;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @JsonCreator
    public Races(@JsonProperty("Circuit") Circuit circuit,@JsonProperty("time") String time,@JsonProperty("season") String season,@JsonProperty("raceName") String raceName,
                 @JsonProperty("round") String round,@JsonProperty("Results") Results[] results,@JsonProperty("date") String date,@JsonProperty("url") String url) {
        Circuit = circuit;
        this.time = time;
        this.season = season;
        this.raceName = raceName;
        this.round = round;
        Results = results;
        this.date = date;
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Circuit = "+Circuit+", time = "+time+", season = "+season+", raceName = "+raceName+", round = "+round+", Results = "+Results+", date = "+date+", url = "+url+"]";
    }
}