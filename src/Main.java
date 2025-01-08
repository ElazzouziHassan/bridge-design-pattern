import bridge.device.Radio;
import bridge.device.TV;
import bridge.remote.AdvancedRemoteControl;
import bridge.remote.RemoteControl;
import bridge.remote.SimpleRemoteControl;

public class Main {
    public static void main(String[] args) {
        // Créer des appareils
        TV tv = new TV();
        Radio radio = new Radio();

        // Créer des télécommandes pour les appareils
        RemoteControl simpleRemoteForTV = new SimpleRemoteControl(tv);
        RemoteControl advancedRemoteForRadio = new AdvancedRemoteControl(radio);

        // Tester la télécommande simple pour la TV
        System.out.println("=== Télécommande simple pour la TV ===");
        simpleRemoteForTV.togglePower(); // Allume la TV
        simpleRemoteForTV.setVolume(20); // Impossible de régler le volume

        // Tester la télécommande avancée pour la Radio
        System.out.println("\n=== Télécommande avancée pour la Radio ===");
        advancedRemoteForRadio.togglePower(); // Allume la Radio
        advancedRemoteForRadio.setVolume(35); // Change le volume
        advancedRemoteForRadio.togglePower(); // Éteint la Radio
    }
}
