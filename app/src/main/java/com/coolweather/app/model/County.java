package com.coolweather.app.model;

/**
 * Created by jiangyuwei on 16/3/20.
 */
public class County {
    private int countyId;
    private String countyName;
    private String countyCode;
    private int cityId;
    public int getId(){
        return countyId;
    }
    public void setId(int countyId){
        this.countyId = countyId;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(String countyCode){
        this.countyCode = countyCode;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
