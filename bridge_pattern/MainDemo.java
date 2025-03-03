package bridge_pattern;

import bridge_pattern.device.Device;
import bridge_pattern.device.RadioDevice;
import bridge_pattern.device.TVDevice;
import bridge_pattern.remote.AdvanceRemote;
import bridge_pattern.remote.BasicRemote;

public class MainDemo {
      public static void main(String[] args) {
        testDevice(new TVDevice());
        testDevice(new RadioDevice());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvanceRemote advancedRemote = new AdvanceRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
