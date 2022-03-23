public class Nawierzchnia {

    //String typNawierzchni; //Asfalt = 1, Beton=Asfalt*1.1 , Kostka brukowa=Asfalt*1.3 , Gruntowa=Asfalt*1.6
    //double intTypNawierzchni;
    //String stanNawierzchni; // Sucha = 1, Mokra = Sucha*1.4 , Lód = Sucha*3 , Snieg = Sucha*2
    //double intStanNawierzchni;
    //int nachylenie;





    public double doubleTypNawierzchni(String typNawierzchni) {

        switch (typNawierzchni) {
            case "Asfalt":
                return 1;
            case "Beton":
                return 1.1;
            case "Kostka brukowa":
                return 1.3;
            case "Droga gruntowa":
                return 1.6;
            default:
                return 1;
        }
    }
    public double doubleStanNawierzchni(String stanNawierzchni){
        switch (stanNawierzchni){
            case "Sucha":
                return  1;
            case "Piasek":
                return  1.2;
            case "Mokra":
                return  1.4;
            case "Lód":
                return  3;
            case "Śnieg":
                return  2;
            default:
                return  1;
        }

    }

    public double wspolczynnikNawierzchni(String typNawierzchni , String stanNawierzchni , int nachylenie){
        double wspolczynnik;
        wspolczynnik = (doubleTypNawierzchni(typNawierzchni)*doubleStanNawierzchni(stanNawierzchni)+nachylenie*0.05);
        return wspolczynnik;

    }





}
