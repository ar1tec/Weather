package com.a5corp.weather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherInfo {
    private Coordinates coord;
    private Main main;
    private String name;
    private Sys sys;
    private Wind wind;
    private long dt;
    private int cod;
    private List<Weather> weather;

    public String getName() {
        return name;
    }

    public long getDt() {
        return dt;
    }

    public long getCod() {
        return cod;
    }

    public Sys getSys() {
        return sys;
    }

    public Wind getWind() {
        return wind;
    }

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public class Main {
        private double temp;
        private double humidity;

        public double getTemp() {
            return temp;
        }

        public int getHumidity() {
            return (int) humidity;
        }
    }

    public class Weather {
        private int id;
        private String description;

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }
    }

    public class Wind {
        private float speed;
        @SerializedName("deg")
        private int direction;

        public float getSpeed() {
            return speed;
        }

        public int getDirection() {
            return direction;
        }
    }

    public class Sys {
        private long sunrise;
        private long sunset;
        private String country;

        public long getSunrise() {
            return sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        private String getCountry() {
            return country;
        }
    }

    public class Coordinates {
        @SerializedName("lat")
        private double latitude;
        @SerializedName("lon")
        private double longitude;

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}