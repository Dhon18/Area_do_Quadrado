package lista01poo;
public class CalculoArea {
    int a, b;
    double s;

    public CalculoArea() {
    }

    public CalculoArea(int a, int b, double s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    

    
    
    public static double calcular(int a, int b, double s){
        s = a + b / 2;
        return Math.pow(s*(s-a)*(s-b), 0.5);
    }
}
