package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;//舒适度指数

    public Sport sport;//运动指数

    @SerializedName("cw")
    public CarWash carWash;//洗车指数

    public class Sport{

        @SerializedName("txt")
        public String info;
    }

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }



    public class CarWash{

        @SerializedName("txt")
        public String info;
    }


}
