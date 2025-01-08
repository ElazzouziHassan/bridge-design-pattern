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

/*
 * Rôle : Représente une télécommande avancée qui peut allumer/éteindre l'appareil et régler son volume.
 * 
 * Explication :
 * Hérite de la classe abstraite RemoteControl.
 * Implémente la méthode setVolume(int volume) pour régler le volume de l'appareil.
 * Utilise également la méthode togglePower() de la classe parente pour allumer/éteindre l'appareil.
 */
