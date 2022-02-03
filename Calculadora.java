package Funciones;
import java.util.Scanner;

public class Calculadora {
    static double suma(double a,double b) {
        return a+b;

    }
    static double resta(double a,double b) {
        return a-b;

    }
    static double multiplicacion(double a,double b) {
        return a*b;

    }
    static double division(double a,double b) {
        return a/b;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Que operación deseas hacer");

            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicación");
            System.out.println("4-División");
            System.out.println("5-Raiz cuadrada");
            System.out.println("6-Potencia");

            System.out.println("7-Salir");

            int option = s.nextInt();

            System.out.println("Ingresa el primer número");
            double num1 = s.nextDouble();
        double num2 = 0;
            if(option != 5){
                System.out.println("Ingresa el segundo número");
                num2 = s.nextDouble();
            }

            s.nextLine();


            switch (option){
                case 1:
                    System.out.println(suma(num1,num2));
                    break;
                case 2:
                    System.out.println(resta(num1,num2));
                    break;
                case 3:
                    System.out.println(multiplicacion(num1,num2));
                    break;
                case 4:
                    System.out.println(division(num1,num2));
                    break;
                case 5:
                    double theRoot=Math.sqrt(num1);
                    System.out.println("Root: " + theRoot);
                    break;
                case 6:
                    double sq= Math.pow(num1,num2);
                    System.out.println("Pow: " + sq);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Error");

            }

            //System.out.print("\033[H\033[2J");
            s.nextLine();

        }
        /*
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double x = s1.nextDouble();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double y = s2.nextDouble();

        System.out.println("La suma es: "+suma(x,y));
        System.out.println("La resta es: "+resta(x,y));
        System.out.println("La multiplicación es: "+multiplicacion(x,y));
        System.out.println("La división es: "+division(x,y));
        */

    }

}
