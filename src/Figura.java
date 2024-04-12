public class Figura {
    private double plotas, krastine1, krastine2, skritulioPlotas;

    public Figura(double krastine1) {
    }


    public double getPlotas() {return plotas;}
    public double getKrastine1() {return krastine1;}
    public double getKrastine2() {return krastine2;}
    public double getSkritulioPlotas() {return skritulioPlotas;}

    public void setPlotas(double plotas) {this.plotas = plotas;}
    public void setKrastine1(double krastine1) {this.krastine1 = krastine1;}
    public void setKrastine2(double krastine2) {this.krastine2 = krastine2;}
    public void setSkritulioPlotas(int skritulioPlotas) {this.skritulioPlotas = skritulioPlotas;}

    public Figura(double krastine1, double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }
    public int skaiciuokPlota(){
            this.plotas = krastine1 * krastine2;
        return 0;
    }
    @Override
    public String toString(){
        skaiciuokPlota();
       return "Jūsų figuros plotas yra " + plotas + " kv.cm";
    }
}
