import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner sc = new Scanner(System.in);
        Generadora g = new Generadora();


        System.out.println("Bienvenido al programa!");

        do {
            System.out.println("Elija una opcion");
            System.out.println("1.-Generar quiniela");
            System.out.println("2.-Generar pares");
            System.out.println("3.-Generar chinos");
            System.out.println("4.-Generar primitiva");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {

                case 0:
                    opc = 0;
                    break;
                case 1:
                    if (g.GenerarQuiniela() == 1) {
                        System.out.println("1");
                    } else if (g.GenerarQuiniela() == 2) {
                        System.out.println("x");
                    } else if (g.GenerarQuiniela() == 3) {
                        System.out.println("2");
                    }
                    break;
                case 2:
                    System.out.println("El resultado es " + g.GenerarPares());
                    break;

                case 3:
                    System.out.println("Los chinos son:  " + g.GenerarChinos());
                    break;
                case 4:
                    System.out.println("La quiniela es: " + g.GenerarPrimitiva());
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opc != 0);
        sc.close();

    }

}
