import java.util.Scanner;
public class MainPalabraInversa{
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        
        System.out.println("ingresa un nombre");
    
        String Palabra = op.next();

        PalabraInversa inversa= new PalabraInversa();
        inversa.setPalabra(Palabra);
        System.out.println("Palabra inversa es: " + inversa.getInversa());


    }
}