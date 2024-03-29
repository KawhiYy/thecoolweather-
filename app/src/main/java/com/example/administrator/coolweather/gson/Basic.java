package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;//城市名

    @SerializedName("id")
    public String weatherId;//城市对应的天气的id

    /*@SerializedName("lat")
    public String cityLat;//城市的经度

    @SerializedName("lon")
    public String cityLon;//城市的纬度*/

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;//接口更新时间

    }

}

