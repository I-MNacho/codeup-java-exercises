//================================= WARM UP
//        Create a class called, WeatherReading, with the following members:

import java.util.Date;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeatherReading {

//private instance variables:
    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;


//add a constructor that sets all fields
//when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInCelsius){
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = kelvinToCelsius(tempInCelsius);
    }


//main method
    public static void main(String[] args) {

        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());

    }





//public static method:
//kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius
//convert Kelvin to Celsius-------------------------------
// for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
public double kelvinToCelsius(double tempInKelvin){
    return tempInKelvin - 273.15;
}


//public instance methods:

    //getters------------------------------------
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    //setters----------------------------------------
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setTempInCelsius(double tempInCelsius) {
        this.tempInCelsius = tempInCelsius;
    }


}
