package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RaceData {
    private MRData MRData;

    public MRData getMRData ()
    {
        return MRData;
    }

    public void setMRData (MRData MRData)
    {
        this.MRData = MRData;
    }

    @JsonCreator
    public RaceData(@JsonProperty("MRData") MRData mrData){
        this.MRData = mrData;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MRData = "+MRData+"]";
    }


}