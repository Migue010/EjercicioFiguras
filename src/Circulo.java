public class Circulo extends Figura {

     double radio;
     final double PI = Math.PI;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI*(radio*radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2*PI*radio;
    }
}
