package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Circuit
{
    private String circuitId;

    private Location Location;

    private String circuitName;

    private String url;

    public String getCircuitId ()
    {
        return circuitId;
    }

    public void setCircuitId (String circuitId)
    {
        this.circuitId = circuitId;
    }

    public Location getLocation ()
    {
        return Location;
    }

    public void setLocation (Location Location)
    {
        this.Location = Location;
    }

    public String getCircuitName ()
    {
        return circuitName;
    }

    public void setCircuitName (String circuitName)
    {
        this.circuitName = circuitName;
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
    public Circuit(@JsonProperty("circuitId") String circuitId,@JsonProperty("Location") Location location,@JsonProperty("circuitName") String circuitName,@JsonProperty("url") String url) {
        this.circuitId = circuitId;
        Location = location;
        this.circuitName = circuitName;
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [circuitId = "+circuitId+", Location = "+Location+", circuitName = "+circuitName+", url = "+url+"]";
    }
}