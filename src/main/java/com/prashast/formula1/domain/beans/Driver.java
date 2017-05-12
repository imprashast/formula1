package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver
{
    private String dateOfBirth;

    private String nationality;

    private String driverId;

    private String familyName;

    private String givenName;

    private String code;

    private String url;

    private String permanentNumber;

    public String getDateOfBirth ()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality ()
    {
        return nationality;
    }

    public void setNationality (String nationality)
    {
        this.nationality = nationality;
    }

    public String getDriverId ()
    {
        return driverId;
    }

    public void setDriverId (String driverId)
    {
        this.driverId = driverId;
    }

    public String getFamilyName ()
    {
        return familyName;
    }

    public void setFamilyName (String familyName)
    {
        this.familyName = familyName;
    }

    public String getGivenName ()
    {
        return givenName;
    }

    public void setGivenName (String givenName)
    {
        this.givenName = givenName;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getPermanentNumber ()
    {
        return permanentNumber;
    }

    public void setPermanentNumber (String permanentNumber)
    {
        this.permanentNumber = permanentNumber;
    }

    @JsonCreator
    public Driver(@JsonProperty("dateOfBirth") String dateOfBirth,@JsonProperty("nationality") String nationality,@JsonProperty("driverId") String driverId,
                  @JsonProperty("familyName") String familyName,@JsonProperty("givenName") String givenName,@JsonProperty("code") String code,
                  @JsonProperty("url") String url,@JsonProperty("permanentNumber") String permanentNumber) {
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.driverId = driverId;
        this.familyName = familyName;
        this.givenName = givenName;
        this.code = code;
        this.url = url;
        this.permanentNumber = permanentNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dateOfBirth = "+dateOfBirth+", nationality = "+nationality+", driverId = "+driverId+", familyName = "+familyName+", givenName = "+givenName+", code = "+code+", url = "+url+", permanentNumber = "+permanentNumber+"]";
    }
}
