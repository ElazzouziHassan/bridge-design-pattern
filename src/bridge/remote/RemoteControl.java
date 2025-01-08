package bridge.remote;

import bridge.IDevice;

public abstract class RemoteControl {
  protected IDevice device; // Référence vers un appareil (Bridge)

    public RemoteControl(IDevice device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isPoweredOn()) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }

    public abstract void setVolume(int volume); // Méthode abstraite pour régler le volume
}
