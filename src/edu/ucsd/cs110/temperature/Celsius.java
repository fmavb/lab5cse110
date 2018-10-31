package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float cel = this.getValue();
        float fahr = (float) (cel*1.8 + 32);
        return new Fahrenheit(fahr);
    }

    public String toString()
    {
        // TODO: Complete this method
        String output;
        float value = getValue();
        output = Float.toString(value);
        return output + " C";
    }
}
