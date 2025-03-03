package bridge_pattern.remote;

import bridge_pattern.device.Device;

public class AdvanceRemote extends BasicRemote {
    public AdvanceRemote(Device device) {
        super(device);
    }
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
