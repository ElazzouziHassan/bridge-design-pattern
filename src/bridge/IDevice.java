package bridge;

public interface IDevice {
  void powerOn(); // Allumer l'appareil
  void powerOff(); // Éteindre l'appareil
  void setVolume(int volume); // Régler le volume
  boolean isPoweredOn(); // Vérifier si l'appareil est allumé ou éteint
}

/*
 * @Explication:
 * powerOn() et powerOff() : Définissent les actions pour allumer/éteindre l'appareil.
 * setVolume(int volume) : Permet de régler le volume de l'appareil.
 * isPoweredOn() : Renvoie true si l'appareil est allumé, sinon false.
 * -------------------------------------------------------------------------------------------
 * => Cette interface permet de garantir que tous les appareils qui l'implémentent (TV, Radio) 
 * auront un comportement cohérent.
 */
