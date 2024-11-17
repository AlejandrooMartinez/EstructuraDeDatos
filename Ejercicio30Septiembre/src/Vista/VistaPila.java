package Vista;

import java.util.Scanner;

public class VistaPila {

    Scanner scanner = new Scanner(System.in);
    int variable;
//    variable  = scanner.nextInt();

    public String pedirExpresion() {
        System.out.println("Ingrese la expresion a validar");
        return scanner.nextLine();
    }

    public void resultados(boolean balanceado) {
        if (balanceado) {
            System.out.println("La expresion esta balanceada");
        } else {
            System.out.println("La expresion no esta balanceada");
        }
    }

}
