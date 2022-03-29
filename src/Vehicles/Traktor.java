package Vehicles;

import java.util.Random;

public class Traktor extends Samochod{

    Random rand = new Random();
    public int liczbaOsi = 2;
    public int  losujMase(){
        masa = rand.nextInt(2000) + 8000;
        return masa;
    }


}