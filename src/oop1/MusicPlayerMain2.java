package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("turning on");

        data.volume++;
        System.out.println("volume : " + data.volume);

        data.volume++;
        System.out.println("volume : " + data.volume);

        data.volume--;
        System.out.println("volume : " + data.volume);

        System.out.println("checking status");
        if(data.isOn){
            System.out.println("ON, volume : " + data.volume);
        }
        else{
            System.out.println("OFF");
        }

        data.isOn = false;
        System.out.println("turning off");
    }
}
