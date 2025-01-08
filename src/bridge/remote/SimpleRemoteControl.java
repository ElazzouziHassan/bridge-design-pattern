package bridge.remote;
import bridge.IDevice;

public class SimpleRemoteControl extends RemoteControl{
  public SimpleRemoteControl(IDevice device) {
    super(device);
  }

  @Override
  public void setVolume(int volume) {
      System.out.println("Télécommande simple ne supporte pas le réglage du volume.");
  }
}
