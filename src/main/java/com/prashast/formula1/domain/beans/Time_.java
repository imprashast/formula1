package com.prashast.formula1.domain.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time_ {

    @SerializedName("time")
    @Expose
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
