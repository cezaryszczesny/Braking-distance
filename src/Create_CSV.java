import java.io.*;

public class Create_CSV extends Okno{
    public void print(String  pojazd, int  masa, int predkosc, double czas, double wspolczynnik, double wspolczynnikSamochod , double w) throws IOException {
        FileWriter fw = new FileWriter("dane.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);

        out.println(pojazd + "; " + masa + "; " + predkosc + "; "  + czas + "; " + wspolczynnik + "; "+ wspolczynnikSamochod+ "; "+ w);
        out.flush();
        out.close();
    }
}
