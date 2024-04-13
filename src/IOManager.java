import java.util.Scanner;

public class IOManager {
    private int pasirinktaFigura;
    private Figura figura;
    Scanner sc = new Scanner(System.in);

    public int getPasirinktaFigure() {
        return pasirinktaFigura;
    }


    public void suzinokFigura() {
        System.out.println("Kokios figūros plotą norite skaičiuoti? 1 - Kvadratas.  2 - Trikampis. 3 - Skritulys.");
        pasirinktaFigura = sc.nextInt();
    }

    public void suzinokKrastines() {
        if (pasirinktaFigura == 1) {
            System.out.println("Įveskite kvadrato kraštinės ilgį: ");
            double krastine1 = sc.nextDouble();
            figura = new Kvadratas(krastine1);
            return;
        }
        if (pasirinktaFigura == 2) {
            System.out.println("Įveskite trikampio pirmos kraštinės ilgį: ");
            double krastine1 = sc.nextDouble();
            System.out.println("Įveskite trikampio antros kraštinės ilgį: ");
            double krastine2 = sc.nextDouble();
            figura = new Trikampis(krastine1, krastine2);
            return;
        }
        if (pasirinktaFigura == 3) {
            System.out.println("Įveskite spindulį: ");
            double skritulioSpindulys = sc.nextInt();
            figura = new Skritulys(skritulioSpindulys);
        } else {
            System.out.println("Tokios figūros ploto skaičiuoti nemoku");
        }
    }

    public void spausdinkPlota() {
        figura.skaiciuokPlota();
        System.out.println(figura);
    }
}
