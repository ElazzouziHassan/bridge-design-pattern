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
/*
 * Rôle : Sert de pont entre les télécommandes (abstraction) et les appareils (implémentation).
 * 
 * Explication :
 * La classe abstraite RemoteControl représente une télécommande générique.
 * Elle contient une référence à un appareil (Device), permettant à la télécommande de contrôler différents
 * appareils (comme une TV ou une Radio).
 * La méthode togglePower() permet d'allumer ou d'éteindre l'appareil de manière alternée.
 * La méthode setVolume(int volume) est déclarée comme abstraite, car le comportement de réglage du volume peut
 * différer entre les télécommandes.
 */
