package lista01poo;
import java.util.Scanner;
public class Lista01POO {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int a=0, b=0, i;
        double s;
        //CalculoArea ca = new CalculoArea();
       for(i = 0 ; i < 2 ; i++){
           System.out.println("Informe um lado do triangulo A: ");
           a = leia.nextInt();
       }
       for(i = 0 ; i < 2 ; i++){
           System.out.println("Informe um lado do triangulo B: ");
           b = leia.nextInt();
       }
        CalculoArea calcular = new CalculoArea();
        System.out.println("O resultado dos dois triangulos é: " + calcular);
    }
}