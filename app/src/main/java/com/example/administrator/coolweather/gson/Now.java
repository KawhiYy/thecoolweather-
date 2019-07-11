package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public String temperature;//温度

    public class More{

        @SerializedName("txt")
        public String info;//天气信息

    }

}
