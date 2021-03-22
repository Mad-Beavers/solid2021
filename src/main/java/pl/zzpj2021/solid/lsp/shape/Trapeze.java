package pl.zzpj2021.solid.lsp.shape;

public class Trapeze extends Triangle {

    private double h;

    public Trapeze(double a, double b, double c, double d, double h) {
        super(a, b, c, d);
        this.h = h;
    }

    @Override
    public double circuit() {
        return a + b + c + d;
    }

    @Override
    public double area() {
        return ((a + b) * h) / 2;
    }
}
