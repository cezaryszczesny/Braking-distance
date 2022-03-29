package Vehicles;

import java.util.Random;

public class Autobus extends Samochod{
    Random rand = new Random();

    public int liczbaOsi = 3;
    public int  losujMase(){
        masa = rand.nextInt(7500) + 7500;
        return masa;
    }

}


