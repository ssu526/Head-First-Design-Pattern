package Chapter_2_Observer_Pattern;

import Chapter_2_Observer_Pattern.Observer.CurrentConditionsDisplay;
import Chapter_2_Observer_Pattern.Observer.HeatIndexDisplay;
import Chapter_2_Observer_Pattern.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 28f);
    }
}
