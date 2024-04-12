public class Trikampis extends Figura{
    private int trikampis;
    public Trikampis(double krastine1, double krastine2){
        super(krastine1, krastine2);
    };
    @Override
    public int skaiciuokPlota(){
        double krastine1 = getKrastine1();
        double krastine2 = getKrastine2();
        this.setPlotas(krastine1 * krastine2 /2);
        return trikampis;
    }
}
