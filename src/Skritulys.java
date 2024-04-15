import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura {
    private int skritulys;
    private BigDecimal result;
    BigDecimal bd = BigDecimal.valueOf(getPlotas());


    public Skritulys(double krastine1) {
        super(krastine1, krastine1);
    }

    @Override
    public int skaiciuokPlota() {
        double krastine1 = getKrastine1();
        double skritulioPlotas = krastine1 * krastine1;
        this.setPlotas(Math.PI * skritulioPlotas);
        return skritulys;
    }
    @Override
    public String toString(){
        //skaiciuokPlota();
        return "Jūsų skritulio plotas yra " + getPlotas() + " kv.cm";
    }
}
