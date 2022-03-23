public class Wynik {
    public double wynik(int predkosc, double czas, double wspolczynnikSamochod , double wspolczynnik){
        double wynik;
        wynik = predkosc*(czas/3600)+wspolczynnik*((predkosc*predkosc)/(2*wspolczynnikSamochod*0.01))+10 ;
    return wynik;
    }



}
