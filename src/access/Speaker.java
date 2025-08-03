package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("Volume can't be higher than 100");
        } else {
            volume += 10;
            System.out.println("Volume 10 + ");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("Volume 10 - ");
    }

    void showVolume() {
        System.out.println("Volume : " + volume);
    }
}
