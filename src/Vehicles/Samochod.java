package Vehicles;

public class Samochod{
    protected int masa;



        public int intAbs(boolean abs){
            if(abs)//Zamiana na wartość liczbową
                return 1;
            else
                return 0;
        }

    public double wspolczynnikSamochod(int sprawnoscHamulca , int stanOpon , int masa , boolean abs, int iloscOsi ){
        double wspolczynnik;
        wspolczynnik=masa-sprawnoscHamulca-stanOpon-intAbs(abs)-(iloscOsi*0.01);
        return wspolczynnik;


    }


}
