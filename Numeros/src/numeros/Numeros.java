package numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar ? [S/N]");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores : " + s);
    }
    
}
