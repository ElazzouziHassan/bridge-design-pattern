package bridge.remote;
import bridge.IDevice;

public class AdvancedRemoteControl extends RemoteControl {
  public AdvancedRemoteControl(IDevice device) {
    super(device);
  }

  @Override
  public void setVolume(int volume) {
      device.setVolume(volume);
  }
}
