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

/*
 * Rôle : Représente une télécommande basique qui peut seulement allumer ou éteindre l'appareil.
 * 
 * Explication :
 * Hérite de la classe abstraite RemoteControl.
 * Implémente la méthode setVolume(int volume) pour indiquer que cette télécommande ne supporte pas le réglage du
 * volume.
 * Utilise la méthode togglePower() de la classe parente pour allumer/éteindre l'appareil.
 */
