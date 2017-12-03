package com.github.vsouhrada.kotlin.workshop.demo.weather;

public class WeatherDemo {

    public void updateWeather(int degrees) {
        String description;
        Color color;

        if (degrees < 5) {
            description = "cold";
            color = Color.BLUE;
        } else if (degrees < 23) {
            description = "mild";
            color = Color.ORANGE;
        } else {
            description = "hot";
            color = Color.RED;
        }

        System.out.println("Description=" + description + " color=" + color);
    }


    public static void main(String [] args) {
        WeatherDemo demo = new WeatherDemo();
        demo.updateWeather(10);
        demo.updateWeather(5);
        demo.updateWeather(30);
    }

}


