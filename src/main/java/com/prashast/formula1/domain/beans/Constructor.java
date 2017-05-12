package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Constructor
{
    private String nationality;

    private String name;

    private String url;

    private String constructorId;

    public String getNationality ()
    {
        return nationality;
    }

    public void setNationality (String nationality)
    {
        this.nationality = nationality;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getConstructorId ()
    {
        return constructorId;
    }

    public void setConstructorId (String constructorId)
    {
        this.constructorId = constructorId;
    }

    @JsonCreator
    public Constructor(@JsonProperty("nationality") String nationality,@JsonProperty("name") String name,@JsonProperty("url") String url,@JsonProperty("constructorId") String constructorId) {
        this.nationality = nationality;
        this.name = name;
        this.url = url;
        this.constructorId = constructorId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nationality = "+nationality+", name = "+name+", url = "+url+", constructorId = "+constructorId+"]";
    }
}