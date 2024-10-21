import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        Triangulo t = new Triangulo();

        List<Triangulo>lstTriangulo=new ArrayList<>();
        List<Rectangulo>lstrectangulo=new ArrayList<>();
        System.out.println("Calcula el area y Perimetro de un Rectangulo un Triangulo o un Circulo");
        int opc=0;
        while (opc!=4){

            System.out.println("Menu \n 1-Rectangulo \n 2-Triangulo \n 3-Circulo");
            System.out.println("Ingresa una opcion!");
            opc = scanner.nextInt();

            switch (opc){

                case 1:
                    System.out.println("Ingresa la base del rectangulo");
                    r.setBase(scanner.nextDouble());


                    System.out.println("Ingresa la altura del rectangulo");
                    r.setAltura(scanner.nextDouble());

                    lstrectangulo.add(new Rectangulo(r.getBase(), r.getAltura()));

                    System.out.println("El area del rectangulo es:"+r.calcularArea());
                    System.out.println("El perimetro del rectangulo es:"+r.calcularPerimetro());

                case 2:

                    System.out.println("Ingresa la base del triangulo");
                    t.setBase(scanner.nextDouble());

                    System.out.println("Ingresa la altura del triangulo");
                    t.setAltura(scanner.nextDouble());

                    System.out.println("Ingresa el valor del lado1 del triangulo");
                    t.setLado1(scanner.nextDouble());

                    System.out.println("Ingresa el valor del lado2 del triangulo");
                    t.setLado2(scanner.nextDouble());

                    System.out.println("Ingresa el valor del lado3 del triangulo");
                    t.setLado3(scanner.nextDouble());

                    lstTriangulo.add(new Triangulo(t.getBase() ,t.getAltura() ,t.getLado1() ,t.getLado2(),t.getLado3()));



            }




        }

    }
}