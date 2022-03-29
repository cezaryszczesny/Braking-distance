package Vehicles;

import java.util.Random;


public class SamochodOsobowy extends Samochod{
    Random rand = new Random();

    public int liczbaOsi = 2;

    public int losujMase(){
        masa = rand.nextInt(850) + 2650;
        System.out.println(masa);
        return masa;
    }


}
