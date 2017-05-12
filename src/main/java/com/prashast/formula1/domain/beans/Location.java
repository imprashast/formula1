package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location
{
    private String locality;

    private String longe;

    private String lat;

    private String country;

    public String getLocality ()
    {
        return locality;
    }

    public void setLocality (String locality)
    {
        this.locality = locality;
    }

    public String getLong ()
    {
        return longe;
    }

    public void setLong (String longe)
    {
        this.longe = longe;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @JsonCreator
    public Location(@JsonProperty("locality") String locality,@JsonProperty("long") String longe,@JsonProperty("lat") String lat,@JsonProperty("country") String country) {
        this.locality = locality;
        this.longe = longe;
        this.lat = lat;
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [locality = "+locality+", long = "+longe+", lat = "+lat+", country = "+country+"]";
    }
}