package bridge.device;
import bridge.IDevice;

public class TV implements IDevice{
  private boolean power = false; // État de l'alimentation (allumé/éteint)
  private int volume = 10; // Niveau du volume (valeur par défaut)

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

/*
 * Explication :
 * La TV a deux états principaux :
 * Éteinte (power = false)
 * Allumée (power = true)
 * Elle peut également stocker et modifier son niveau de volume.
 * Les méthodes powerOn() et powerOff() changent l'état de la TV et affichent un message dans la console.
 * La méthode setVolume(int volume) ajuste le volume de la TV.
 * La méthode isPoweredOn() permet de vérifier si la TV est allumée ou éteinte.
 */
