public class Skritulys extends Figura {
    private int skritulys;


    public Skritulys(int krastine1) {
        super(krastine1);
    }
    @Override
    public int skaiciuokPlota() {
        double krastine1 = getKrastine1();
        this.setSkritulioPlotas((int) krastine1);
        return skritulys;

    }
}
