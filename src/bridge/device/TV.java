package bridge.device;
import bridge.IDevice;

public class TV implements IDevice{
  private boolean power = false;
  private int volume = 10;

  @Override
  public void powerOn() {
    power = true;
    System.out.println("TV allumée.");
  }

  @Override
    public void powerOff() {
        power = false;
        System.out.println("TV éteinte.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume TV réglé à : " + this.volume);
    }

    @Override
    public boolean isPoweredOn() {
        return power;
    }
}
