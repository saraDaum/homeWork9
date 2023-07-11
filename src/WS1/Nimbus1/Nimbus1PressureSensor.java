package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    Random  md = new Random();
    public Nimbus1PressureSensor(String s, int i) {
        super(s, i);
    }

    @Override
    public int read() {
        return new Random().nextInt(950,1050);
    }
}
