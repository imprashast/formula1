package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MRData
{
    private String total;

    private String limit;

    private String series;

    private RaceTable RaceTable;

    private String xmlns;

    private String offset;

    private String url;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public String getSeries ()
    {
        return series;
    }

    public void setSeries (String series)
    {
        this.series = series;
    }

    public RaceTable getRaceTable ()
    {
        return RaceTable;
    }

    public void setRaceTable (RaceTable RaceTable)
    {
        this.RaceTable = RaceTable;
    }

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
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
    public MRData(@JsonProperty("total") String total, @JsonProperty("limit") String limit, @JsonProperty("series") String series, @JsonProperty("RaceTable") RaceTable raceTable, @JsonProperty("xmlns") String xmlns, @JsonProperty("offset") String offset, @JsonProperty("url") String url) {
        this.total = total;
        this.limit = limit;
        this.series = series;
        RaceTable = raceTable;
        this.xmlns = xmlns;
        this.offset = offset;
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", series = "+series+", RaceTable = "+RaceTable+", xmlns = "+xmlns+", offset = "+offset+", url = "+url+"]";
    }
}
