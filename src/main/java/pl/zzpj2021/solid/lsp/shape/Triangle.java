package pl.zzpj2021.solid.lsp.shape;

public class Triangle extends Rectangle {
    protected double c,d;

    //b = h
    public Triangle(double a, double b, double c, double d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    public double circuit() {
        return a + c + d;
    }

    @Override
    public double area() {
        return a * b / 2;
    }
}
