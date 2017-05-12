package com.prashast.formula1.domain.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Results
{
    private Driver Driver;

    private String position;

    private String laps;

    private Time Time;

    private String status;

    private String grid;

    private String number;

    private FastestLap FastestLap;

    private Constructor Constructor;

    private String points;

    private String positionText;

    public Driver getDriver ()
    {
        return Driver;
    }

    public void setDriver (Driver Driver)
    {
        this.Driver = Driver;
    }

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getLaps ()
    {
        return laps;
    }

    public void setLaps (String laps)
    {
        this.laps = laps;
    }

    public Time getTime ()
    {
        return Time;
    }

    public void setTime (Time Time)
    {
        this.Time = Time;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getGrid ()
    {
        return grid;
    }

    public void setGrid (String grid)
    {
        this.grid = grid;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public FastestLap getFastestLap ()
    {
        return FastestLap;
    }

    public void setFastestLap (FastestLap FastestLap)
    {
        this.FastestLap = FastestLap;
    }

    public Constructor getConstructor ()
    {
        return Constructor;
    }

    public void setConstructor (Constructor Constructor)
    {
        this.Constructor = Constructor;
    }

    public String getPoints ()
    {
        return points;
    }

    public void setPoints (String points)
    {
        this.points = points;
    }

    public String getPositionText ()
    {
        return positionText;
    }

    public void setPositionText (String positionText)
    {
        this.positionText = positionText;
    }

    @JsonCreator
    public Results(@JsonProperty("Driver") Driver driver,@JsonProperty("position") String position,@JsonProperty("laps") String laps,
                   @JsonProperty("Time") Time time,@JsonProperty("status") String status,@JsonProperty("grid") String grid,
                   @JsonProperty("number") String number,@JsonProperty("FastestLap") FastestLap fastestLap,@JsonProperty("Constructor") Constructor constructor,
                   @JsonProperty("points") String points,@JsonProperty("positionText") String positionText) {
        Driver = driver;
        this.position = position;
        this.laps = laps;
        Time = time;
        this.status = status;
        this.grid = grid;
        this.number = number;
        FastestLap = fastestLap;
        Constructor = constructor;
        this.points = points;
        this.positionText = positionText;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Driver = "+Driver+", position = "+position+", laps = "+laps+", Time = "+Time+", status = "+status+", grid = "+grid+", number = "+number+", FastestLap = "+FastestLap+", Constructor = "+Constructor+", points = "+points+", positionText = "+positionText+"]";
    }
}
