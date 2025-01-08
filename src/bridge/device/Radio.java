package bridge.device;
import bridge.IDevice;

public class Radio implements IDevice {
    private boolean power = false;
    private int volume = 20;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("Radio allumée.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("Radio éteinte.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume Radio réglé à : " + this.volume);
    }

    @Override
    public boolean isPoweredOn() {
        return power;
    }
}
