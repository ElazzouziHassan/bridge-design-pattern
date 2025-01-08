package bridge.device;
import bridge.IDevice;

public class Radio implements IDevice {
    private boolean power = false; // État de l'alimentation (allumé/éteint)
    private int volume = 20; // Niveau du volume (valeur par défaut)

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

/*
 * Explication :
 * Les fonctionnalités de la Radio sont similaires à celles de la TV.
 * Cependant, la radio peut avoir un volume par défaut différent (30 dans ce cas).
 * Les méthodes permettent de gérer l'état (allumé/éteint) et le volume de la radio.
 */