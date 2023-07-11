package WS1.System;
import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

public class MainClassWS1
{
    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        //TODO Fix this error
       // MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        //TODO Fix this error
       // Log p_log = new Log(ws);

    }
}