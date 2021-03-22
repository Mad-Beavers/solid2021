package pl.zzpj2021.solid.lsp.shape;

public class Circle extends Square {

    public Circle(double a) {
        super(a);
    }

    @Override
    public double area() {
        return Math.PI * a * a;
    }

    @Override
    public double circuit() {
        return 2 * Math.PI * a;
    }
}
