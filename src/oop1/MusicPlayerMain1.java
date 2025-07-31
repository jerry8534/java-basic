package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("turning on");

        volume++;
        System.out.println("volume : " + volume);

        volume++;
        System.out.println("volume : " + volume);

        volume--;
        System.out.println("volume : " + volume);

        System.out.println("checking status");
        if(isOn){
            System.out.println("ON, volume : " + volume);
        }
        else{
            System.out.println("OFF");
        }

        isOn = false;
        System.out.println("turning off");
    }
}
