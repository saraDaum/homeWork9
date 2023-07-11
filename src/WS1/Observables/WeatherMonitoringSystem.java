package WS1.Observables;

import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

public class WeatherMonitoringSystem {
    protected static WeatherMonitoringSystem instance = null;

    public static WeatherMonitoringSystem theInstance()
    {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
    public static void main(String[] args)
    {
        WeatherMonitoringSystem ws =
                WeatherMonitoringSystem.theInstance();

        MonitoringScreen p_MonitorScreen =
                new MonitoringScreen();
        Log p_log = new Log();

    }


}
