package pl.zzpj2021.solid.lsp.shape;

public class Square  {
    protected double a;

    public Square(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }


    public double area() {
        return a * a;
    }

    public double circuit() {
        return 4 * a;
    }
}
