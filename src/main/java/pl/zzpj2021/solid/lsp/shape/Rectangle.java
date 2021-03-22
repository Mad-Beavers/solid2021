package pl.zzpj2021.solid.lsp.shape;

public class Rectangle extends Square{
    protected double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double circuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public double area() {
        return a * b;
    }
}
