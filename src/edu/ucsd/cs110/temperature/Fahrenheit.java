package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float fahr = this.getValue();
        float celsius = (fahr - 32) * 5/9;
        return new Celsius(celsius);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        float value = getValue();
        String output = Float.toString(value);
        return output + " F";
    }
}
