package co.edu.um.FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 11/08/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura {

    private double lado;

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
