package bridge;

public interface IDevice {
  void powerOn();
  void powerOff();
  void setVolume(int volume);
  boolean isPoweredOn();
}
