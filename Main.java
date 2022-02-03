package Funciones;
import java.util.Scanner;

public class Main {

    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.nextLine();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
        System.out.println(name.length());
    }

    private static void printNameCharacters( String name )
    {
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }

}
