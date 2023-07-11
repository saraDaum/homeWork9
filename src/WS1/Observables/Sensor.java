package WS1.Observables;

public class Sensor {
    public int lastReading = 0;
    public int interval = 0;
   public String type = "";

    public Sensor(String s, int i){
       type = s;
       interval = i;
    }

    protected int read(){
        return 0;
    }

    public void check(){}
}
