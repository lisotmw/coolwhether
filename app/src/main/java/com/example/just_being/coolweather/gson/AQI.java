package com.example.just_being.coolweather.gson;

/**
 * Created by Administrator on 2017/12/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}