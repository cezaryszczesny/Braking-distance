package Vehicles;

import java.util.Random;

public class AutoCiezarowe extends Samochod{
    Random rand = new Random();

    public int liczbaOsi = 4;
    public int losujMase(){
        masa = rand.nextInt(3500) + 4000;
        return masa;
    }

}
