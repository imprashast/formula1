package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FastestLap
{
    private AverageSpeed AverageSpeed;

    private String rank;

    private Time Time;

    private String lap;

    public AverageSpeed getAverageSpeed ()
    {
        return AverageSpeed;
    }

    public void setAverageSpeed (AverageSpeed AverageSpeed)
    {
        this.AverageSpeed = AverageSpeed;
    }

    public String getRank ()
    {
        return rank;
    }

    public void setRank (String rank)
    {
        this.rank = rank;
    }

    public Time getTime ()
    {
        return Time;
    }

    public void setTime (Time Time)
    {
        this.Time = Time;
    }

    public String getLap ()
    {
        return lap;
    }

    public void setLap (String lap)
    {
        this.lap = lap;
    }

    @JsonCreator
    public FastestLap(@JsonProperty("AverageSpeed") AverageSpeed averageSpeed,@JsonProperty("rank") String rank, @JsonProperty("Time") Time time,@JsonProperty("lap") String lap) {
        AverageSpeed = averageSpeed;
        this.rank = rank;
        Time = time;
        this.lap = lap;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [AverageSpeed = "+AverageSpeed+", rank = "+rank+", Time = "+Time+", lap = "+lap+"]";
    }
}