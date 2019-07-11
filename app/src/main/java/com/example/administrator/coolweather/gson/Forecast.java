package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public  String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature {

        public String max;//最高温度

        public String min;//最低温度


    }
    public class More{

        @SerializedName("txt_d")
        public String info;//白天天气状况描述

        @SerializedName("txt_n")
        public String night_info;//晚间天气状况描述
    }

}
