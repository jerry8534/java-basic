package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("on");
    }

    void off() {
        isOn = false;
        System.out.println("off");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume : " + volume);
    }

    void showStatus() {
        System.out.println("showStatus");
        if (isOn) {
            System.out.println("on, volume : " + volume);
        } else {
            System.out.println("off");
        }
    }
}
