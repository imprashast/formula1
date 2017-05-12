package com.prashast.formula1.domain.beans;

public class AverageSpeed
{
    private String speed;

    private String units;

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    public String getUnits ()
    {
        return units;
    }

    public void setUnits (String units)
    {
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [speed = "+speed+", units = "+units+"]";
    }
}

