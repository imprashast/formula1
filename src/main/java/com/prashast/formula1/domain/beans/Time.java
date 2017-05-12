package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Time
{
    private String time;

    private String millis;

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getMillis ()
    {
        return millis;
    }

    public void setMillis (String millis)
    {
        this.millis = millis;
    }

    @JsonCreator
    public Time(@JsonProperty("time") String time,@JsonProperty("millis") String millis) {
        this.time = time;
        this.millis = millis;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [time = "+time+", millis = "+millis+"]";
    }
}
