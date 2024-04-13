import java.math.BigDecimal;

public class Skritulys extends Figura {
    private int skritulys;
    private int skritulioPlotas;
    private double a = getPlotas();
    BigDecimal bigDecimal = new BigDecimal(Double.toString(skritulys));

    public Skritulys(double krastine1) {
        super(krastine1, krastine1);
    }
    @Override
    public int skaiciuokPlota() {
        double krastine1 = getKrastine1();
        double skritulioPlotas = krastine1 * krastine1;
        this.setPlotas(Math.PI * skritulioPlotas);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(getPlotas());
        return skritulys;

    }
    @Override
    public String toString(){
        skaiciuokPlota();
        return "Jūsų skritulio plotas yra " + getPlotas() + " kv.cm";
    }
}
