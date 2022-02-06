
package za.ac.cput;

import java.util.Locale;

public class SharfaaSA {
    private double temp;
    private String tempUnit;

    public SharfaaSA(double temp, String tempUnit){
        this.temp = temp;
        this.tempUnit = tempUnit;
    }

    public String temperatureConverter(){
        switch (tempUnit.toUpperCase()) {
            case "C":
                return "The temperature in Celcius is: " + ((temp*9)/5)+32;
            case "F":
                return "The temperature in Farenheit is: " + ((temp-32)*5/9);
            default:
                return "Invalid";
        }

    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    @Override
    public String toString() {
        return "Temperature = " + temp + ", Temperature Unit = " + tempUnit;
    }
}
